#.......................................Modules............................................
#....................................calendar....................................
"""import calendar
yy = 2024
mm = 2
print(calendar.month(yy,mm))"""

#.................................calendar- input from keyboard................................
"""import calendar
yy = int(input("Enter year : "))
mm = int(input("Enter month : "))
print(calendar.month(yy,mm))"""


"""import calendar
year=int(input("Enter year: "))
calendar.prcal(year)"""

##from calendar import prcal
##year=int(input("Enter year: "))
##prcal(year)

##from calendar import*
##year=int(input("Enter year: "))
##prcal(year)

"""import calendar as cal
year=int(input("Enter year: "))
cal.prcal(year)"""


#............................import datetime module................................
"""import datetime
x=datetime.datetime.now( )
print(x)"""

#.................................math module...................................................
##import math
##print(math.floor(1.4))
##print(math.floor(5.0))
##print(math.ceil(5.3))
##print(math.ceil(-5.3))
##print(math.ceil(22.6))
##print(math.ceil(20.11))


"""import math
print(math.floor(1.4))
print(math.ceil(5.0))
print(math.ceil(5.3))
print(math.ceil(-5.3))
print(math.ceil(22.6))
print(math.ceil(10.0))"""

#.............................dir() it is used visible the pre-defined functions of modules........................................................
##import sys,calendar
##print("The list of methods and attributes in the local scope:", dir())
##print("\nThe list of methods and attributes in the calendar module:", dir(calendar))
##print("\nThe list of methods and attributes in the sys module:", dir(sys))

#..............................create module........................................
import mymodule
mymodule.greeting("Tom")


#...............................
"""import sys
print(len(sys.argv))
sum=0
for i in range(1,len(sys.argv)):
#for i in range(1,4):
    #sum+=i
    sum+=int(sys.argv[i])
print("Result=",sum)"""


##import sys
##print("There are %d arguments" %len(sys.argv))
##print("The command line arguments are: ")
##print(sys.argv)
##for i in sys.argv:
##    print(i)
##print("Path of the Python is",sys.path)


"""import sys,calendar
print("The list of methods and attributes in the local scope:", dir())
print("\nThe list of methods and attributes in the calendar module:", dir(calendar))
print("\nThe list of methods and attributes in the sys module:", dir(sys))"""










