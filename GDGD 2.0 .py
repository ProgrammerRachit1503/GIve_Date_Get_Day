import calendar
day = int(input("Please enter the day: "))
month = int(input("Please enter the month: "))
year = int(input("Please enter the year: "))
day_of_week = calendar.weekday(year, month, day)
daysofweek = ["Sunday","Monday","Tuesday" , "Wednesday" , "Thursday " , "Friday" , "Saturday"]
print(daysofweek[day_of_week])