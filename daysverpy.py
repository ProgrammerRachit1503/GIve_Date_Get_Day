numDays = [31,28,31,30,31,30,31,31,30,31,30,31]
month = int(input("Please enter the month: "))
day = int(input("Please enter the day: "))
year = int(input("Please enter the year: "))

wasteYear = (year-1)%400
wastedays=0
while wasteYear != 0:
    if wasteYear >= 100:
        wastedays += 5
        wasteYear -= 100
    else:
        leapQ = int(wasteYear/4)
        normQ = wasteYear -leapQ
        wastedays += (leapQ*2) + normQ
        wasteYear = 0
monthdays = 0
i = month -1
while i != 0:
    if year%4==0 and i==2:
        if year%100 == 0 and year!=0:
            monthdays +=28
            i -= 1
        else:
            monthdays+=29
            i -= 1
    else:
        monthdays += numDays[i-1]
        i-= 1
wasteday = (wastedays + monthdays + day)%7
daysofweek=["Sunday","Monday","Tuesday" , "Wednesday" , "Thursday " , "Friday" , "Saturday"]
print(daysofweek[wasteday])
