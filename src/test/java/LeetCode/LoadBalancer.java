package LeetCode;

import java.util.*;

public class LoadBalancer {
        public static void main (String[] args){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Provide the Load");
            String loaddata=scanner.next();
            String[] tokens = loaddata.split(",|:");

            Map<String,Integer> map  = new HashMap<String,Integer>();
            for(int i=0;i<tokens.length-1;){
                map.put(tokens[i++],Integer.parseInt(tokens[i++]));
            }
            System.out.println(map);

            for(int j=0;j<=100;j++) {
                System.out.println("The server to which the call has to go is: " + getServer(allServers(map)));
            }
        }

        public static List allServers(Map map){
            List<String> ListOfservers = new ArrayList<String>();
            Iterator<Map.Entry<String,Integer>> entries= map.entrySet().iterator();
            while(entries.hasNext()){
                Map.Entry<String,Integer> entry = entries.next();
                String server = entry.getKey();
                Integer load = entry.getValue();

                while (load!=null && load>0){
                    ListOfservers.add(server);
                    load--;
                }
            }

            return ListOfservers;
        }

        public static String getServer(List list){
            String server;
            List<String> servers = list;
            int num = new Random().nextInt(list.size());
            return server=servers.get(num);
        }
    }

