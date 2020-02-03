/*package testfile.testfile;

import com.akamai.ids.crons.util.CronUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.InputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import javax.sql.DataSource;
import java.sql.ResultSet;
import javax.annotation.PostConstruct;

*//**
 * Sample controller
 *
 *//*
@Controller
public class SampleController {
    private Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    @Qualifier("oracleDataSourceFactory")
    private DataSource dataSource;

    @RequestMapping("/v1/test")
    public
    @ResponseBody
    String showMessage() {
        return "Test";
    }

     Test function: load last submitted from the timezone,tag or accesscontrol tables ump tables
     * and print to file ddc.write_dir 
     * Tablenames can be:tz(text), tag (text), access (binary)
     * timezone file: DDC_CP_TZ_CONFIG_FILE, ddc.cpcodes.timezone.conf 
     * select * from DDC_CP_TZ_CONFIG_FILE where metadata_ver = (select max(metadata_ver) from DDC_CP_TZ_CONFIG_FILE)
     * 
     * tag file: DDC_CP_TAG_CONFIG_FILE, ddc.cpcodes.tag.conf
     * select * from DDC_CP_TAG_CONFIG_FILE where metadata_ver = (select max(metadata_ver) from DDC_CP_TAG_CONFIG_FILE)
     *
     * access control file: extapi.DDC_ACS_CTRL_UMP_FILES, ddcdir.ac_allow_list.portal/ac_allow_list.portal.conf
     * select * from extapi.DDC_ACS_CTRL_UMP_FILES where metadata_ver = (select max(metadata_ver) from extapi.DDC_ACS_CTRL_UMP_FILES);
     
    @RequestMapping(value = "/v1/test/ddc/{tableName}", method = RequestMethod.GET)
    public @ResponseBody ResponseEntity<?> getDataFromDb(@PathVariable String tableName) {
        // Only allowed in dev envs
        if(CronUtil.isProduction()) {
            return new ResponseEntity<>(HttpStatus.FORBIDDEN);
        }
        String orTable = ""; 
        String workDir = "/pulsar-logs-root/";
        String fileName = "";
        if(tableName != null && !tableName.isEmpty()) {
            if(tableName.equals("tz")) {
                orTable = "ddc_cp_tz_config_file";
                fileName = workDir + tableName + ".txt"; 
            } else if(tableName.equals("tag")) {
                orTable = "ddc_cp_tag_config_file";
                fileName = workDir + tableName + ".txt";
            } else if(tableName.equals("access")) {
                orTable = "extapi.ddc_acs_ctrl_ump_files";
                fileName = workDir + tableName + ".ser";
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        log.debug("[getDataFromDb] filename: " + fileName + " ortable: " + orTable + " tablename: " + tableName);
        try {
            StringBuffer sqlBuffer=new StringBuffer();
            sqlBuffer.append("select metadata_content from ");
            sqlBuffer.append(orTable);
            sqlBuffer.append(" where metadata_ver = (select max(metadata_ver) from ");
            sqlBuffer.append(orTable);
            sqlBuffer.append(")");
            log.debug("[getDataFromDb] sql: " + sqlBuffer.toString());
            //String sql = "select metadata_content from ? where metadata_ver = (select max(metadata_ver) from ?)";
            Connection conn = dataSource.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sqlBuffer.toString());
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()) {
                 FileOutputStream bw=new FileOutputStream(fileName);
                 InputStream in=rs.getBlob("metadata_content").getBinaryStream();
                 byte[] inBytes = new byte[8192];
                 int read = 0;
                 while( (read = in.read(inBytes)) > 0) {
                     bw.write(inBytes, 0, read);
                 }
                 in.close();
                 bw.flush();
                 bw.close();
            }
            if(rs!=null) rs.close();
            if(pstmt!=null) pstmt.close();
       } catch (Exception ex) {
           log.info("error: " + ex.getMessage());
           return null;         
       }
       return new ResponseEntity<>(HttpStatus.OK);
    }
}
*/