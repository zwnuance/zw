package org.zw.hbase;

import org.apache.hadoop.hbase.*;
import org.apache.hadoop.hbase.client.*;
import org.apache.hadoop.hbase.util.Bytes;

import java.io.IOException;

/**
 * Created by zw on 16-3-6.
 */
public class HBaseTest {

    public static void main(String[] args) {
        HBaseTest test = new HBaseTest();
        test.test();
    }

    public void test() {
        testScan();
    }

    public void testScan() {
        try {
            Connection conn = ConnectionFactory.createConnection();
            TableName tableName = TableName.valueOf("site");
            Table table = conn.getTable(tableName);
            Scan scan = new Scan();
            scan.addColumn("www".getBytes(), "url".getBytes());
            ResultScanner rScanner = table.getScanner(scan);

            for (Result r = rScanner.next(); r != null; r = rScanner.next()) {
                for (Cell cell : r.rawCells()) {
                    System.out.println(Bytes.toString(CellUtil.cloneRow(cell)) + ":"
                            + Bytes.toString(CellUtil.cloneFamily(cell)) + ","
                            + Bytes.toString(CellUtil.cloneQualifier(cell)) + ","
                            + Bytes.toString(CellUtil.cloneValue(cell)));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
