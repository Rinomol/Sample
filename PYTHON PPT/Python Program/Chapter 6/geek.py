#....................................create a file in folder...................................
"""f = open("dem.txt", "w")
f.close()"""

#...............................read a file.........................................
"""f = open("demone.txt", "r")
print(f.read())
f.close()"""

##f = open("D:\\example\\demone.txt", "r")
##print(f.read())
##f.close()

##f = open("dem.txt", "r")
##print(f.read())
##f.close()

#........................................write in a file...............................
"""f = open("demone.txt", "w")
f.write("I love python")
f.close()"""


##matter='''Python is a great language
##Easy to understand and learn
##Supports Object Oriented Programming
##Also used in Web Development'''
##f=open('dem.txt','w')
##f.write(matter)
##f.close()



#..............................append()........................................
"""f = open("demone.txt", "a")
f.write("\nHello everyone")
f.close()"""


#..............................readline()..................................................
"""f = open("dem.txt", "r")
print(f.readline())
print(f.readline())"""

#.........................................readlines()........................................
"""f = open("dem.txt", "r")
print(f.readlines())"""


#.........................................create new file 'x'................................
"""f = open("myfile.txt", "x")
f.close()"""


#............................delete a file................................
"""import os
os.remove("myfile.txt")"""


#.................................method attribute discripter.........................................
"""f=open("dem.txt","r")
print("Name of the file:",f.name)
print("Closed?",f.closed)
print("Opening Mode:",f.mode)
print("File number descriptor is :",f.fileno())
print("Readable?",f.readable())
print("Writable?",f.writable())
f.close()
print("Closed?",f.closed)"""


#........................................using stdout to read....................................................
"""import sys
f=open("dem.txt","r")
lines=f.readlines()
print("The contents in the files are:", lines)
print("The contents in the filess are:")
for line in lines:
    sys.stdout.write(line)
print("\n\nThe content in the filesss are:")
for i in range(1,len(lines)):
    sys.stdout.write(lines[i])
print("\nlength ",len(lines))
f.close()"""


#................................................append ' a ' for read stdout...............................
"""matter2='''\nIts very hot today
Lets have a cold drink'''
f=open("aboutpython.txt","a")
f.write(matter2)
#f.write("\n%s"%matter2)
f.close()"""

##import sys
##f=open("aboutpython.txt","r")
##lines=f.readlines()
##f.close()
##print("The contents in the file are:")
##for line in lines:
##    sys.stdout.write(line)
##    #print(line)


#..........................................Copying content from the files.....................................................
"""f=open("aboutpython.txt","r")
lines=f.read()
print(lines)
f.close()

g=open("copyabtpython.txt",'w')
g.write(lines)
g.close()

print("The copy of the file is made")
g=open("copyabtpython.txt",'r')
lines=g.read()
print(lines)
g.close()"""


#.............................................delete content from files...............................................................
"""import sys
f=open("aboutpython.txt","r")
lines=f.readlines()
print(lines)
print("Original content of the file:")
for line in lines:
    sys.stdout.write(line)
f.close()
del lines[1:3]

f=open("aboutpython.txt","w")
f.writelines(lines)
f.close()
print("\nThe content of the file after deleting second and third line : ")
f=open("aboutpython.txt","r")
lines=f.read()
print(lines)
f.close() """


#...................................................update content from file...............................................
'''import sys
f=open("aboutpython.txt","r")
lines=f.readlines()
print("Original content of the file:")
for line in lines:
    sys.stdout.write(line)
f.close()
n=int(input("\n\nEnter the line number to change: "))
if n <= len(lines):
    r=input("Enter the new content: ")
    lines[n-1]=r+"\n"
    f=open("aboutpython.txt","w")
    f.writelines(lines)
    f.close()
    print("The content of the file after updating line" ,n)
    f=open("aboutpython.txt","r")
    lines=f.read()
    print(lines)
    f.close()
else:
    print("The line number ",n , "is not found in the file")'''


#..................................................read content of a file randomly.................................................
##f=open("aboutpython.txt","r+")
##line=f.readline()
##print("A line from files is :",line)
##f.seek(2)
##line=f.readline()
##print("The line from character 6 till end of line is :", line)
##print("The pointer is at location",f.tell())
##f.seek(10)
##line=f.read(20)
##print("The fifteen character starting at location 11 are as: ", line)



#...............................access specific content from a file..................................
"""import linecache
line=linecache.getline("aboutpython.txt",3)
print("The content of the third line is: ", line)"""



#...........................................creating binary file................................................................
#............................................convert string into string of byte..........................................
"""import pickle
data = input('Enter a string: ')
byteobj = pickle.dumps(data)
print(byteobj)"""


#..............................................Creating a Binary Files...................................
str="Hello World"
f=open("filebinary.bin","w")
line=f.write(str)
f.close()
f=open("filebinary.bin","r")
fcontent=f.read()
print(fcontent)
f.close()










