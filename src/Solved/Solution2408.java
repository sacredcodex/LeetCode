package Solved;

import java.util.HashMap;
import java.util.List;

public class Solution2408 {
    class SQL {

        HashMap<String, Table> map;

        class Table{
            HashMap<Integer, List<String>> map;
            int curId;
            int columnNum;

            public Table(int columnNum){
                this.columnNum = columnNum;
                map = new HashMap<>();
                curId = 1;
            }

            public void insert(List<String> row){
                map.put(curId++, row);
            }

            public void delete(int row){
                map.remove(row);
            }

            public String select(int row, int col){
                return map.get(row).get(col);
            }
        }

        public SQL(List<String> names, List<Integer> columns) {
            map = new HashMap<>();
            for (int i = 0; i < names.size(); i++) {
                map.put(names.get(i), new Table(columns.get(i)));
            }
        }

        public void insertRow(String name, List<String> row) {
            map.get(name).insert(row);
        }

        public void deleteRow(String name, int rowId) {
            map.get(name).delete(rowId);
        }

        public String selectCell(String name, int rowId, int columnId) {
            return map.get(name).select(rowId, columnId);
        }
    }
}
