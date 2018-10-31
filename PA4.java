String path = "data/special_events_list_datasd.csv";
int latColIndex = 9;
int longColIndex = 10;
int typeColIndex = 2;
int attendColIndex =5;

boolean hasLat (String row){
  return (length(substring(row, latColIndex, latColIndex+1))) > 0;

}

boolean test= hasLat(readLine(path, 23));
boolean test2= hasLat(readLine(path,26));
