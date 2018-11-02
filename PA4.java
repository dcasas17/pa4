String path = "data/special_events_list_datasd.csv";
int latColIndex = 10;
int longColIndex = 11;
int typeColIndex = 2;
int attendColIndex =5;

boolean hasLat (String row){
  return length(dataAtColumn(row, latColIndex)) > 0 ;
}

boolean latTest= hasLat(readLine(path, 25));
boolean latTestEx = true;
boolean latTest2= hasLat(readLine(path,24));
boolean latTestEx2 = false;
boolean latTest3 = hasLat(readLine(path,15));
boolean latTestEx3 = true;


boolean hasLong (String row){
  return length(dataAtColumn(row, longColIndex)) > 0 ;
}

boolean longTest = hasLong(readLine(path,10));
boolean longTestEx = true;
boolean longTest2 = hasLong(readLine(path, 20));
boolean longTestEx2 = true;
boolean longTest3 = hasLong(readLine(path,24));
boolean longTestEx3 = false;


boolean isNorthOf(String row, double lat){
  return parseDouble(dataAtColumn(row, latColIndex)) > lat;
}

boolean northTest = isNorthOf(readLine(path, 15), 30.6);
boolean northTestEx = true;
boolean northTest2 = isNorthOf(readLine(path, 17), 100.0);
boolean northTestEx2 = false;
boolean northTest3 = isNorthOf(readLine(path, 25), 25.0);
boolean northTestEx3 = false;

boolean isSouthOf(String row, double lat){
  return parseDouble(dataAtColumn(row, latColIndex)) < lat;
}

boolean southTest = isSouthOf(readLine(path, 29), 35.0);
boolean southTestEx = true;
boolean southTest2 = isSouthOf(readLine(path, 30), 30.0);
boolean southTestEx2 = false;
boolean southTest3= isSouthOf(readLine(path, 32), 29.0);
boolean southTestEx3 = false;

boolean isEastOf(String row, double longitude){
  return parseDouble(dataAtColumn(row, longColIndex)) > longitude;
}

boolean eastTest = isEastOf(readLine(path, 4), -117.0);
boolean eastTestEx = false;
boolean eastTest2 = isEastOf(readLine(path, 5), -120.0);
boolean eastTestEx2 = true;
boolean eastTest3 = isEastOf(readLine(path, 6), -116.0);
boolean eastTestEx3 = false;

boolean isWestOf(String row, double longitude){
  return parseDouble(dataAtColumn(row, longColIndex)) < longitude;
}

boolean westTest = isWestOf(readLine(path, 6), -117.0);
boolean westTestEx = true;
boolean westTest2 = isWestOf(readLine(path, 7), -120.0);
boolean westTestEx2 = false;
boolean westTest3 = isWestOf(readLine(path, 8), -116.0);
boolean westTestEx3 = true;

boolean inBox(String row, double swLat, double swLong, double neLat, double neLong) {
  double inLat = parseDouble(dataAtColumn(row, latColIndex));
  double inLong = parseDouble(dataAtColumn(row,longColIndex));

  return swLat <= inLat && inLat <= neLat && swLong <= inLong && inLong <= neLong;
}

boolean boxTest = inBox(readLine(path, 9), 20.568, -140.748, 40.23, -110.43);
boolean boxTestEx = true;
boolean boxTest2 = inBox(readLine(path, 30), 10.344, -130.324, 45.242, -100.324);
boolean boxTestEx2 = true;
boolean boxTest3 = inBox(readLine(path, 31), 25.523, -150.236, 20.365, -98.012);
boolean boxTestEx3 = false;

boolean eventOfType(String row, String event){
  return stringEquals(dataAtColumn(row, typeColIndex), event);
}

boolean eventTest = eventOfType(readLine(path, 34), "FARMERS");
boolean eventTestEx = true
boolean eventTest2 = eventOfType(readLine(path, 57), "ATHLETIC");
boolean eventTestEx2 = true
boolean eventTest3 = eventOfType(readLine(path, 64), "CONCERTS");
boolean eventTestEx3 = false

boolean hasNumAttend(String row){
  return length(dataAtColumn(row, attendColIndex)) > 0;
}

boolean boxTest = hasNumAttend(readLine(path, 13));
boolean boxTestEx = true;
boolean boxTest2 = hasNumAttend(readLine(path, 27));
boolean boxTestEx2 = true;
boolean boxTest3 = hasNumAttend(readLine(path, 54));
boolean boxTestEx3 = true;


String events = readFile(path);
String conCoords = filter(filter(events, r -> hasLat(r)), r -> hasLong(r));
String concerts = filter(conCoords, r -> eventOfType(r, "CONCERTS"));
int numConcertRows = numRows(concerts)-1;
boolean drawMyTable = drawGeoTable(concerts, 20); */
double easternmostConcert = -117.1301472;

String athletics = filter(events, r -> eventOfType(r, "ATHLETIC"));
String athCoords = filter(filter(athletics, r -> hasLat(r)), r -> hasLong(r));
int numAthRows = numRows(athCoords)-1;
boolean drawTable = drawGeoTable(athCoords, 40);
String moreNorthAthletics = "more north than south";

String festivals = filter(events, r -> eventOfType(r, "FESTIVAL"));
String parkRows = filter(festivals, r-> inbox(r, 32.7189, -117.1593, 32.7409, --17.1338));
int numParkRows = numRows(parkRows)-1;
boolean drawTable2 = drawGeoTable(parkRows, 15);
int medAtBalboaFestivals = 132;
