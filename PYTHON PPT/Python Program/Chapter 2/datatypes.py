
#...................................................................DATA TYPES.........................................
#....................numeric...........................
##A=10
##B=2.56
##C=2+1j
##print(type(A))
##print(type(B))
##print(type(C))


#......................number system conversion..........................
##no=500
##print("The decimal value of", no, "is:")
##print(bin(no),"in binary.")
##print(oct(no), "in octal.")
##print(hex(no), " in hexadecimal.")


#........................String..............................
##var1='Hello World'
##var2="Python Programming"
##print(var1)
##print(var2)


#......................string special operators......................
"""str="Hello World"
print(str)
print(str[0])
print(str[2:7])     #//2nd index-1
print(str[2:])
print(str[:2])
print(str * 2)
print(str+'TEST')"""

#................string built in functions........................
##a="hello world"
##b="HELLO"
##print(a.capitalize())
##print('-'.join(b))
##print(len(a))
##print(max(a))
##print(min(b))
##print(a.title())
##print(a.upper())
##print(b.lower())
##print(a.find('r'))
##print(a.replace('hello', 'hai'))


#.......................list...............................
##list1 = ["Apple", "Mango", "Orange"]
##print(list1)
##list2 = list()
##print(list2)
##list3 = [2021,['hello', 2020],2.0]
##print(list3)


#..........................List operators..........................
##list=['abcd',786, 2.23,'john',70.2]
##list2=[123, 'john']
##list3=list + list2
##list4=['hi']
##print(len(list))
##print(list3)
##print(list4 * 3)
##print(123 in list2)
##for x in list2:
##    print(x)


#....................access value from list....................
##list1=['physics', 'chemistry', 1997,2000]
##list2=[1,2,3,4,5,6,7]
##print("list1[0]:",list1[0])
##print("list2[1:5]:",list2[1:5])


#............................update in list........................
##list = ['physics','chemistry',1997,2000]
##print("Value at index 2: ")
##print(list[2])
##list[2]=2001
##print("New value at index 2:")
##print(list[2])


#........................insert().................
##thislist = ['apple', 'banana', 'cherry']
##thislist.insert(1,"watermelon")
##print(thislist)

#..........................delete..............................
"""list1=['physics' , 'chemistry' , 1997, 2000]
print(list1)
##del list1[2]
##print("After deleting : ")
##print(list1)
##list1.remove('chemistry')
##print(list1)
list1.pop(0)
print(list1)"""


#..........................clear().........................
##thislist = ['banana', 'mango', 'orange']
##thislist.clear()
##print(thislist)

#........................append().........................................
##thislist = ['apple', 'orange', 'banana']
##print(thislist)
##thislist.append('pineapple')
##print(thislist)

#...........................extend()........................
##thislist = ['apple', 'orange', 'banana']
##thislist2 = [2,4,6,8]
##print(thislist)
##thislist.extend(("cherry", "grapes"))
##print(thislist)
##thislist2.extend(thislist)
##print(thislist2)

#..............................built in functions.........................
##my_list=[5,6,7,8,9,10]
##tuple1=(1,2,3)
##print(my_list)
##print(len(my_list))
##print(max(my_list))
##print(min(my_list))
##print(my_list.index(10))
##print(tuple1)
##print(list(tuple1))


#...........................List Methods....................
"""listone = [1,2,3,4,5,6,7,8,9]
list2=["mango", "orange", "apple"]
print(listone)
listone.append(10)
print(listone)
x=list2.count('mango')
print(x)
print(list2)
##listone.extend([50,70])
##listone.extend({50,60})
##listone.extend((50,50))
##listone.extend(list2)
##print(listone)
list2.extend(listone)
print(list2)
print(listone.index(3))
listone.remove(5)
print(listone)
list2.reverse()
print(list2)"""


#..........................Tuples..............................
##tup1=('Maths', 'Chemistry', 1996 ,2021)
##tup2=(1,2,3,4,5,6,7)
##tup3="a" , "b" , "c" , "d"
##tup4=tuple()
##print(tup1)
##print(tup2)
##print(tup3)
##print(tup4)


#...........................Tuples operation..................................
##list=('abcd',786, 2.23,'john',70.2)
##list2=(1,2,3, 'john')
##list3=list + list2
##list4=("hi!")
##print(len(list))
##print(list3)
##print(list4 * 3)
##print(123 in list2)
##for x in list2:
##    print(x)


#.....................Access value from tuple.............................
##tup1=("Maths" , "Chemistry" , 1996 ,2021)
##tup2=(1,2,3,4,5,6,7)
##print("tup1[0]:  ", tup1[0])
##print("tup2[1:5]: ", tup2[1:5])


#.......................delete tuple.......................
##tup1=('Maths' , 'Chemistry' , 1996 ,2021)
##del tup1


#......................Tuple  function.......................
##my_tuple=('p', 'y', 't', 'h','o','n', 'p','r', 'o', 'g', 'r', 'a', 'm')
##print(my_tuple.count('p'))
##print(my_tuple.index('n'))
##print('a' in my_tuple)
##print(len(my_tuple))
##print(my_tuple[-5])
##print(max(my_tuple))
##print(min(my_tuple))


#.....................SET..................
##thisset = {"mango", "orange", "apple"}
##print(thisset)
##print(len(thisset))


#.........................Dictionary..........................
##dict={'Name' : 'zara' , 'Age' : 7 , 'Class' : 'First'}
##dict1={'Name' :'jerry' , 1:[2,4,3] }
##print(dict)
##print(dict1)

#....................Access value in dictionary........................
##dict={'Name' : 'zara' , 'Age' : 7 , 'Class' : 'First'}
##print("dict['Name'] : " , dict['Name'])
##print("dict['Age'] : " , dict['Age'])


#............................update dictionary...................
##dict={'Name' : 'zara' , 'Age' : 7 , 'Class' : 'First'}
##print(dict)
##dict['Age'] = 8;
##dict['School'] = "DPS School"
##print(dict)

#..........................delete in dictionary.......................
"""dict={'Name' : 'zara' , 'Age' : 7 , 'Class' : 'First'}
print(dict)
del dict['Name']
print(dict)
#print(dict.pop('Class'))
dict.pop('Class')
print(dict)
dict.clear()
print(dict)
del dict
print(dict)"""

#.............................nested dictionary..............
##dict={ 1: 'aaa', 2:'bbb',3:{'A':111,'B':222}}
##print(dict[3])
##print(dict)


#....................Built in functions...................
##dict = {1:2,7:3,5:8,'Hi' : 'Ravi', 'odd' : 7}
##print(dict)
##print(str(dict))
##print(list(dict))


#........................dictionary program..........................
"""dict = {}
print(dict)
dict[0] = 'Geeks'
dict[2] = 'For'
dict[3] = 1
print(dict)
dict['Value-Set'] = 2, 3, 4
print(dict)
dict[2] = 10
print(dict)
dict[5] = {'nested' : {'1' : 'life', '2' : 'geeks'}}
print(dict)"""


##state=[{'doni','india'},
##       {'maxwell','Australia'},
##       {'peterson','Eng'}
##       ]
##output={}
##output=dict(state)
##print(output)


#.....................................enumerate()..........................................
"""l1=['a','b','c','d']
d1=dict(enumerate(l1))
print(d1)"""


#........................fromkeys.................##all key values are same used for fromkeys
###inputgiven=['red','blue','green']
###output:{'red':'colors','blue':'colors','green':'colors'}
##l2=['red','blue','green']
##d2=dict.fromkeys(l2,'colors')
##print(d2)



















