#...........................OOPS........................................
#...........................Inheritance....................................
#..............................Single inheritance................................
"""class rect:
    def __init__(self):
        self.l = 8
        self.b = 5
    def rectarea(self):
        return self.l * self.b
class triangle(rect):
    def __init__(self):
        rect.__init__(self)
        self.x = 10
        self.y = 40
    def triarea(self):
        return 1/2 * self.x * self.y
r = triangle()
print("Area of rectangle is ", r.rectarea())
print("Area of triangle is ", r.triarea())"""


#...............................multi level inheritnce.............................
##class Worker:
##    def __init__(self, c, n, s):
##        self.code = c
##        self.name = n
##        self.salary = s
##    def showWorker(self):
##        print("Code is : " , self.code)
##        print("Name is : ", self.name)
##        print("Salary is : ", self.salary)
##class Officer(Worker):
##    def __init__(self, c, n, s):
##        Worker.__init__(self, c, n, s)
##        self.hra = s * 60/100
##    def showOfficer(self):
##        Worker.showWorker(self)
##        print("HRA - House Rent Allowance is : ", self.hra)
##class Manager(Officer):
##    def __init__(self, c, n, s):
##        Officer.__init__(self, c, n, s)
##        self.hra = s*60/100
##        self.da = s*98/100
##    def showManager(self):
##        Officer.showOfficer(self)
##        print("HRA - House Rent Allowance  : ", self.hra)
##        print("DA - Dearness Allowance is : ", self.da)
##w = Worker(101, 'John', 2000)
##o = Officer(102, 'David', 3000)
##m = Manager(103, 'Ben', 5000)
##print("Information of worker is ")
##w.showWorker()
##print("\n Informaton of Officer is ")
##o.showOfficer()
##print("\n Information of  manager is : ")
##m.showManager()
##m = Manager(101,'John', 20000)
##m.showManager()

#........................................Hierarical inheritance...........................................
"""class Student:
    def __init__(self, r, n):
        self.rollno = r
        self.name = n
    def showStudent(self):
        print("Roll No : ", self.rollno)
        print("Name : ", self.name)
class Science(Student):
    def __init__(self, r, n, p, c):
        Student.__init__(self, r, n)
        self.physics = p
        self.chemistry = c
    def showScience(self):
        Student.showStudent(self)
        print("Physics mark : ", self.physics)
        print("Chemistry mark : ", self.chemistry)
class Arts(Student):
    def __init__(self, r, n, h, g):
        Student.__init__(self, r, n)
        self.history = h
        self.geograpy = g
    def showArts(self):
        Student.showStudent(self)
        print("History mark : ", self.history)
        print("Geograpy mark : ", self.geograpy)
s = Science(101, "Ravi", 98, 88)
a = Arts(102, 'Sita', 99,86)
print("Information of science student : ")
s.showScience()
print()
print("Information of arts student : ")
a.showArts()"""
    

#..................................Multiple inheritance...................................
"""class rect:
    def __init__(self):
        self.l=8
        self.b=5
    def area(self):
        return self.l*self.b
class triangle:
    def __init__(self):
        self.x=10
        self.y=6
    def triarea(self):
        return 1/2*self.x*self.y
class both(rect,triangle):
    def __init__(self):
        rect.__init__(self)
        triangle.__init__(self)
    pass
r=both()
print("Area of rectangle is ",r.area())
print("Area of trianglr is ", r.triarea())"""


#...................................
"""class rect:
    def __init__(self):
        self.l = 8
        self.b = 5
    def area(self):
        return self.l * self.b
class triangle(rect):
    def __init__(self):
        rect.__init__(self)
        self.x = 10
        self.y = 20
    def area(self):
        return 1/2 * self.x * self.y
r = triangle()
print("Area of triangle : ", r.area())"""


##class rect:
##    def __init__(self):
##        self.l = 8
##        self.b = 5
##    def area(self):
##        print("Area of rectangle : ", self.l * self.b)
##class triangle(rect):
##    def __init__(self):
##        rect.__init__(self)
##        self.x = 10
##        self.y = 20
##    def area(self):
##        rect.area(self)
##        print("Area of triangle : ", 1/2 * self.x * self.y)
##r = triangle()
##r.area()


"""class book:
    def __init__(self, x):
        self.price = x

class stocklist(book):
    def __init__(self, x):
        book.__init__(self,x)
    def commission(self):
        self.comm = self.price*5/100
        print("Commission of stocklist is %.2f" %self.comm)

class distributor(book):
    def __init__(self, x):
        book.__init__(self, x)
    def commission(self):
        self.comm = self.price * 8/100
        print("Commission of Distributor is %.2f" %self.comm)

class retailer(book):
    def __init__(self, x):
        book.__init__(self, x)
    def commission(self):
        self.comm = self.price * 10/100
        print("Commission of retailer is %.2f" %self.comm)

r = stocklist(100)
s = distributor(100)
t = retailer(100)
prncomm = [r, s, t]
for c in prncomm:
    c.commission()"""


#..............................Operator overloading.....................................
class rect:
    def __init__(self, x, y):
        self.l = x
        self.b = y
    def __str__(self):
        return 'Length is %d, Breadth is %d'%(self.l, self.b)
##    def __add__(self, other):
##        return rect(self.l + other.l, self.b + other.b)
    def rectarea(self):
        return self.l * self.b

r1 = rect(5,8)
##r2 = rect(10,20)
##r3 = r1 + r2
##print(r3)
##print("Area of rectangle is ", r3.rectarea())
print(r1.rectarea)


#.......................Descriptors.......................................
##class product:
##    def __init__(self, name, x=5):
##        self.name = name
##        self.price = x
##    def __set__(self, obj, value):
##        print("Setting attribute ", self.name)
##        self.price = value
##    def __get__(self, obj, objtype):
##        print('Getting attribute ', self.name)
##        return self.price
##class cart:
##    p = product("butter", 7)
##k = cart()
##print(k.p)
##k.p = 10
##print(k.p)






























