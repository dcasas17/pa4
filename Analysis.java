String path = "data/special_events_list_datasd.csv";
String path2 = "data/special_events_short.csv"
String events = readFile(path);
String eventsHeader = readLine(path, 0);

int numEvents = numRows(events);
int numColumns = 11;
int wholeNumberDataColIndex = 1;
int wholeNumberDataHeaderIndex = 1;
double numericalDataColIndex = 10;
double numericalDataHeaderLabel = 10;
String stringDataColIndex = "Holiday Bowl";
String stringDataHeaderLabel = "event_host";
String nonNumericalAttendanceEventID = "";
int missingCoordEventID = 25;
int numEventTypes = 4;
