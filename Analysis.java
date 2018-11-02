String path = "data/special_events_list_datasd.csv";
String path2 = "data/special_events_short.csv"
String events = readFile(path);
String eventsHeader = readLine(path, 0);

int numEvents = numRows(events)-1;
int numColumns = 12;
int wholeNumberDataColIndex = 1;
String wholeNumberDataHeaderLabel = "event_id";
int numericalDataColIndex = 10;
String numericalDataHeaderLabel = "lat";
int stringDataColIndex = 0;
String stringDataHeaderLabel = "event_title";
int nonNumericalAttendanceEventID = 51282;
int missingCoordEventID = 50929;
int numEventTypes = 7;
