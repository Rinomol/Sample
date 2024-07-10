#..........GUI USING TKINTER.................................
##GUI means:A graphical user interface(connection) (GUI) is a desktop interface
##that allows you to communicate with computers.
#......what is mean by tkinter.......
##1.Tkinter is a python library that can be used to create basic graphical user interface.
##2.In python it is the most widly used module for GUI application
##3.tkinter is the python interface of Tk
#.....create window.....
##import tkinter
##window=tkinter.Tk()
##window.title("window")
##window.geometry("500x500")
##window.resizable(height="false" ,width="false")# or ( 0,0 )
##window.config(bg="red")
##window.mainloop()#mainloop() is a method when your application is ready to run

##import tkinter
##window=tkinter.Tk()
##window.title("application")
##window.geometry("500x500")
##window.resizable(height="false",width="false")
##window.config(bg="red")
##window.mainloop()#mainloop() is a method when your application is ready to run

#..button and message box.....
##from tkinter import *
##from tkinter import messagebox
##window=Tk()
##window.title("window")
##window.geometry("500x500")
##window.resizable(height="false",width="false")
##window.config(bg="red")
##def click():
##    messagebox.showinfo("message","Welcome to all")
##    
##b=Button(window,text="Click Me",font=("Times",25),bg="white",command=click)
##b.place(x=200,y=50)
##window.mainloop()

#......label and Entry
##from tkinter import *
##window=Tk()
##window.title("window")
##window.geometry("500x500")
##window.resizable(height="false" ,width="false")
##window.config(bg="red")
##l=Label(window,text="User Name",font=("Times",25),bg="red",fg="white").place(x=50,y=50)
##e=Entry(window,bd=10).place(x=250,y=60)
##window.mainloop()

###.....checkbutton...
##from tkinter import *
##window=Tk()
##window.title("window")
##window.geometry("500x500")
##window.resizable(height="false" ,width="false")
##window.config(bg="red")
##l=Label(window,text="Select course",font=("Times",25),bg="red",fg="white").place(x=50,y=50)
##ck1=IntVar()
##ck2=IntVar()
##c1=Checkbutton(window,text="c/c++",font=("times",20),bg="red",fg="black",
##               variable=ck1,onvalue=1,offvalue=0)
##c1.place(x=80,y=150)
##c2=Checkbutton(window,text="python",font=("times",20),bg="red",fg="black",
##               variable=ck2,onvalue=1,offvalue=0)
##c2.place(x=80,y=180)  
##window.mainloop()

#......Radiobutton..........
##from tkinter import * 
##window=Tk()
##window.title("window")
##window.geometry("500x500")
##window.resizable(height="false" ,width="false")
##window.config(bg="red")
##l=Label(window,text="Gender",font=("Times",25),bg="red",fg="white").place(x=50,y=50)
##v=IntVar()
##m=Radiobutton(window,text="Male",font=("times",20),bg="red",
##               variable=v,value=1)
##m.place(x=80,y=150)
##f=Radiobutton(window,text="Female",font=("times",20),bg="red",
##               variable=v,value=2)
##f.place(x=200,y=150)
##o=Radiobutton(window,text="Others",font=("times",20),bg="red",state="disable",
##               variable=v,value=3)
##o.place(x=350,y=150)
##window.mainloop() 

#.......list box...........
##from tkinter import *
##window=Tk()
##window.title("window")
##window.geometry("500x500")
##window.resizable(height="false" ,width="false")
##window.config(bg="red")
##l=Label(window,text="Fruits List",font=("Times",25),bg="red",fg="white").place(x=50,y=50)
##lst=Listbox(window,bd=8)
##lst.insert(1,"Apple")
##lst.insert(2,"Mango")
##lst.insert(3,"Banana")
##lst.place(x=100,y=100)
##
##window.mainloop()

#.........combobox............

##from tkinter import *
##from tkinter.ttk import Combobox
##window=Tk()
##window.title("window")
##window.geometry("500x500")
##window.resizable(height="false" ,width="false")
##window.config(bg="red")
##l=Label(window,text="Combobox",font=("Times",25),bg="red",fg="white").place(x=50,y=50)
##cb=Combobox(window,width=14,font=('Times',12))
##cb['values']=('Nagercoil','Marthandam','Mylacode','Alencode','Vattam')
##cb.current(0)
##cb.place(x=150,y=100)
##window.mainloop()
## 
#.....................MenuBar.................
##from tkinter import *
##window=Tk()
##window.title("window")
##window.geometry("500x500")
##window.resizable(height="false" ,width="false")
##window.config(bg="red")
##
##menubar = Menu(window)  
##
##file = Menu(menubar,tearoff=0)  
##file.add_command(label="New")  
##file.add_command(label="Open")  
##file.add_command(label="Save")  
##file.add_command(label="Save as...")  
##file.add_command(label="Close")  
##file.add_separator()  
##file.add_command(label="Exit")  
##menubar.add_cascade(label="File", menu=file)  
####
##edit = Menu(menubar, tearoff=0)  
##edit.add_command(label="Undo")  
##edit.add_separator()  
##edit.add_command( label="Cut")  
##edit.add_command(label="Copy")  
##edit.add_command(label="Paste")  
##edit.add_command(label="Delete")  
##edit.add_command(label="Select All")  
##menubar.add_cascade(label="Edit", menu=edit)  
##
##help = Menu(menubar, tearoff=0)  
##help.add_command(label="About")  
##menubar.add_cascade(label="Help", menu=help)  
##window.config(menu=menubar)  
##window.mainloop()

###....scrollbar....
##from tkinter import * 
##window = Tk() 
##scrollbar = Scrollbar(window)
##scrollbar.pack( side = RIGHT, fill = Y )
##mylist = Listbox(window, yscrollcommand = scrollbar.set )
##for line in range(100):
##    mylist.insert(END, "This is line number " + str(line))
##mylist.pack( side = LEFT, fill = BOTH )
##scrollbar.config( command = mylist.yview )
####mainloop()

#.....scale.......
##from tkinter import *
##window=Tk()
##window.title("window")
##window.geometry("500x500")
##window.resizable(height="false" ,width="false")
##window.config(bg="red")
##v=DoubleVar()
##scale=Scale(window,from_=1,to=100,variable=v,orient=HORIZONTAL)
##scale.pack(anchor=CENTER)
##
##def select():
##    result='value='+str(v.get())
##    l1.config(text=result)
##
##b=Button(window,text='value',command=select)
##b.pack(anchor=CENTER,pady=40)
##
##l1=Label(window,text='measurment')
##l1.pack()
##
##window.mainloop()

#......scroll and text..........
##from tkinter import *
##window=Tk()
##y=Scrollbar(window,orient=VERTICAL)
##y.pack(side=RIGHT,fill=Y)
##x=Scrollbar(window,orient=HORIZONTAL)
##x.pack(side=BOTTOM,fill=X)
###text
##t=Text(window,height=500,width=500,yscrollcommand=y.set,
##xscrollcommand=x.set,wrap='none')
##for i in range(50):
##    t.insert(END,'\n Graphical User Interface Tkinter python Programming')
##
##y.config(command=t.yview)
##x.config(command=t.xview)
##t.pack()

#........Top level...........,
from tkinter import*
win=Tk()
def qus1():
    win.withdraw()
    global t
    t=Toplevel() 
    t.config(background='pink')
    t.geometry('600x600')
    l1=Label(t,text='1 .  What is the Orange part of an egg called?',background='pink',
             font=('link free',14))
    l1.place(x=20,y=10)
    global r1
    r1=StringVar()
    r11=Radiobutton(t,text='York',font=('times',14),background='pink',value='York',
                    variable=r1,tristatevalue=0).place(x=55,y=45)
    r12=Radiobutton(t,text='Yolk',font=('times',14),background='pink',value='Yolk',
                    variable=r1,tristatevalue=0).place(x=130,y=45)
    r13=Radiobutton(t,text='Woke',font=('times',14),background='pink',value='Woke',
                    variable=r1,tristatevalue=0).place(x=210,y=45)
    
    r13nxtbutn1=Button(t,text='Next',padx=11,pady=11,background='yellow',font=('times',14)
                       ,command=qus2).place(x=450,y=500)

def qus2():
    t.withdraw()
    global t1
    t1=Toplevel()
    t1.config(background='blue')
    t1.geometry('600x600')
    l1=Label(t1,text="Hello welcome to all",background='Blue',font=('times',14))
    l1.place(x=20,y=10)


win.geometry('600x600')
win.config(background='green')
b=Button(win,text="Start",font=("times",25),command=qus1).place(x=100,y=100)
    
#......spinbox....
##from tkinter import *  
##  
##top = Tk()  
##  
##top.geometry("200x200")  
##  
##spin = Spinbox(top, from_= 0, to = 25)  
##  
##spin.pack()  
##  
##top.mainloop()


#..........................Image............
##from tkinter import*
##from PIL import Image,ImageTk#cmd:pip install pillow
##w=Tk()
##w.title("Adding Image")
##w.geometry("500x500")
##w.resizable(height=0,width=0)
##
##img=Image.open("image1.jpg")#image save on python program folder
##resiz=img.resize((500,500))
##render=ImageTk.PhotoImage(resiz)
##
##lb=Label(w,image=render)
##lb.place(x=10,y=10)
##lab=Label(w,text="username").pack()
##w.mainloop()


###........canvas.......
##
##from  tkinter import *
##
##w = Tk()
##
##C = Canvas(w, bg="blue", height=350, width=600)
##
##coord =( 80, 60, 240, 240)
##arc = C.create_arc(coord, start=0, extent=350,
##                   fill="red")
##
##C.pack()
##w.mainloop()


##.......................delete item in combo box..........
##import tkinter as tk
##def remove_item():
##    selection = listbox.curselection()  # Get the index of the selected item
    ##    if selection:  # Check if any item is selected
    ##        index = selection[0]  # Get the first selected item's index
    ##        listbox.delete(index)  # Delete the item at the specified index
    ##
    ##root = tk.Tk()
    ##root.geometry("300x200")
    ##
    ##listbox = tk.Listbox(root)
    ##listbox.pack(pady=10)
    ##
    ### Insert some items into the Listbox
    ##for item in ["Item 1", "Item 2", "Item 3"]:
    ##    listbox.insert(tk.END, item)
    ##
    ##remove_button = tk.Button(root, text="Remove Item", command=remove_item)
    ##remove_button.pack()
    ##
    ##root.mainloop()

##combobox delete
##import tkinter as tk
##from tkinter import ttk
##
##def remove_item():
##    index = combobox.current()  # Get the index of the selected item
##    if index != -1:  # Check if any item is selected
##        combobox['values'] = combobox['values'][:index] + combobox['values'][index+1:]  # Remove the item from the values
##        combobox.current(max(0, index - 1))  # Move the selection to the previous item
##
##root = tk.Tk()
##root.geometry("300x200")
##
##combobox = ttk.Combobox(root, values=["Item 1", "Item 2", "Item 3"])
##combobox.pack(pady=10)
##
##remove_button = tk.Button(root, text="Remove Item", command=remove_item)
##remove_button.pack()
##
##root.mainloop()



##.......connect the database......................
##import sqlite3
##conn = sqlite3.connect('aji.db');
##print("Opened database successfully");
##
###......create table.....
##conn.execute('''CREATE TABLE if not exists USER 
##         (ROLLNO INT NOT NULL,
##         NAME TEXT NOT NULL,
##         AGE INT NOT NULL,
##         ADDRESS CHAR(50),
##         SALARY REAL);''')
##print("Table created successfully")


###......insert data 
##conn.execute('''INSERT INTO USER (ROLLNO,NAME,AGE,ADDRESS,SALARY) 
##      VALUES (1, 'ajith', 22, 'Chennai', 30000.00 )''');
##conn.commit()
##print("Records created successfully");
##
##conn.close()


#....update the data....
##conn.execute('''UPDATE user
##SET Name='shalini' where RollNo=1 ''');
##conn.commit()
##print('update successfully')


#......delete the data.......
##conn.execute('''DELETE from User where Name = 'shalini' ''');
##
##conn.commit()
##print('data delete successfully')



##import tkinter as tk
##
##def change_color():
##   if button['bg'] == 'red':
##      button.config(bg='blue', fg='white')
##      button['text'] = 'Clicked!'
##   else:
##      button.config(bg='red', fg='black')
##      button['text'] = 'Click me'
##
##root = tk.Tk()
##root.title("Tkinter Configure Parameters")
##root.geometry("700x250")
##
##button = tk.Button(root, text='Click me', bg='red', fg='black', width=10, height=2, font=('Arial', 12, 'bold'), command=change_color)
##button.pack(pady=10)
##
##root.mainloop()
