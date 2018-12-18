import subprocess
import os 




#Ripping the USDA site data for search criteria
request = input("Search for what?: ")
saved = request 
request = request.replace(" ", "+")
bareRequest = "https://ndb.nal.usda.gov/ndb/search/list?SYNCHRONIZER_TOKEN=920de5f3-33a0-4c7b-9b55-04f3a1325774&SYNCHRONIZER_URI=%2Fndb%2Fsearch%2Flist&qt=&qlookup=" + request + "&ds=&manu="
retcode = subprocess.call(['wget', '-O', 'file.txt', bareRequest], stderr=subprocess.DEVNULL)

#Opening ripped data
downloadData = open("file.txt", "r")
count = 0 
for x in downloadData:
    if saved.lower() in x.lower():
        print(x)
    count+=1

print("Read " + str(count) + " lines")

