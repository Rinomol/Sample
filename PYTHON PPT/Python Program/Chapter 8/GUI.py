#...........................................................Basic..........................................................................
##import tkinter 
##w=tkinter.Tk()
##w.title("Demo")
##w.geometry("500x400")
##w.resizable(height="false",width="false")   #or (0,0)
###w.configure(background="yellow")
##w.config(bg="blue")
##w.mainloop()      # mainloop() is a method when your application is ready to run


#.........................................button........................................................
##from tkinter import *
##w=Tk()
##w.geometry("600x500")
##w.title("WELCOME")
##w.config(bg="pink")
##def dis():
##    print("hello world")
##b=Button(w,text="Click",font=("times",25,"bold"), bg="yellow",
##         fg="red", activeforeground="blue", activebackground="orange", command=dis)
##b.pack()
##w.mainloop()


#.......................................................message box..............................................................
##from tkinter import*
##from tkinter import messagebox
##w=Tk()
##w.geometry("600x400")
##w.title("Welcome")
##w.config(bg="blue")
##def click():
##    messagebox.showinfo("message","welcome to all")
##b=Button(w,text="click",font="times,20,bold",bg="grey",fg="red",command=click)
##b.place(x=10,y=20)
##w.mainloop()


#.............................................label and entry.........................................................
"""from tkinter import*
w=Tk()
w.geometry("500x500")
w.config(bg="red")
w.title("Welcome")
w.resizable(height=0,width=0)
l=Label(w, text="User Name", font=("times",20), bg="red", fg="white").place(x=50, y=50)
e=Entry(w,bd=10,cursor="plus cursor")
e.place(x=250, y=60)
w.mainloop()"""



#.......................................................checkbutton....................................................
"""from tkinter import*
w=Tk()
w.geometry("500x500")
w.title("Checkbutton")
w.config(bg="yellow")
w.resizable(height=0,width=0)

l=Label(w,text="Select course", font=("times",20,"bold"), bg="red", fg="white")
l.place(x=10, y=50)
ck1=IntVar()
ck2=IntVar()
c1=Checkbutton(w,text="C/C++", font=("times",18),
                fg="black", variable=ck1, onvalue=1, offvalue=0)
c1.place(x=80, y=100)
c2=Checkbutton(w,text="Python", font=("times",18),
                fg="black", variable=ck2, onvalue=1, offvalue=0)
c2.place(x=200, y=100)

w.mainloop()"""



#..................................................Radiobutton............................................................
'''from tkinter import *
w=Tk()
w.geometry("400x400")
w.title("Radiobutton")
l=Label(w, text="Gender", font=("times",20,"bold"), bg="blue", fg="yellow")
l.place(x=10,y=50)
rd=IntVar()
m=Radiobutton(w, text="Male", value=1, variable=rd)
f=Radiobutton(w, text="Female", value=2, variable=rd)
o=Radiobutton(w, text="Others", value=3, variable=rd, state="disable")
m.place(x=100, y=100)
f.place(x=200, y=100)
o.place(x=300, y=100)

w.mainloop()'''


#...........................................Listbox.......................................
##from tkinter import*
##w=Tk()
##w.geometry("400x400")
##w.configure(bg="brown")
##w.title("Listbox")
##l=Label(w, text="Fruits List", font=("times",20,"bold"), bg="blue")
##l.place(x=50,y=50)
##li=Listbox(w, bd=8)
##li.insert(1,"Apple")
##li.insert(2,"Orange")
##li.insert(3,"Mango")
##li.place(x=100, y=100)
##
##w.mainloop()


#.............................................Combobox....................................................
##from tkinter import*
##from tkinter.ttk import Combobox
##w=Tk()
##w.geometry("400x400")
##w.title("Combobox")
##l=Label(w, text="Combobox", font=("times",18,"bold"))
##l.place(x=10,y=50)
##cb=Combobox(w, width=14, font=("times", 12))
##cb['values'] = ('Nagercoil', 'Marthandam', 'Chennai', 'Madurai')
##cb.current(0)
##cb.place(x=150,y=60)
##
##w.mainloop()


#..................................Menubutton.................................................
'''from tkinter import*
w=Tk()
w.geometry("400x400")
w.title("Menubutton")
mb=Menubutton(w, text="Languages", relief=RAISED)
mb.menu=Menu(mb,tearoff=1)
mb['menu']=mb.menu
v1=IntVar()
v2=IntVar()
mb.menu.add_checkbutton(label="Tamil", variable=v1)
mb.menu.add_checkbutton(label="English", variable=v2)
mb.pack(side=TOP)
w.mainloop()'''


#....................................................Menu..................................................
##from tkinter import*
##w=Tk()
##w.geometry("400x400")
##w.title("Menu")
##w.config(bg="blue")
##
##menubar=Menu(w)
##file=Menu(menubar, tearoff=0)
##file.add_command(label="New")
##file.add_command(label="Open")
##file.add_command(label="Save")
##file.add_command(label="Save as..")
##file.add_command(label="Close")
##file.add_separator()
##file.add_command(label="Exit")
##menubar.add_cascade(label="File", menu=file)
##
##edit=Menu(menubar, tearoff=0)
##edit.add_command(label="Undo")
##edit.add_separator()
##edit.add_command(label="Cut")
##edit.add_command(label="Copy")
##edit.add_command(label="Paste")
##edit.add_command(label="Delete")
##edit.add_command(label="Select All")
##menubar.add_cascade(label="Edit", menu=edit)
##
##help=Menu(menubar, tearoff=0)
##help.add_command(label="About")
##menubar.add_cascade(label="Help", menu=help)
##w.config(menu=menubar)
##
##w.mainloop()


#...................................................scale................................................
##from tkinter import*
##w=Tk()
##w.geometry("400x400")
##w.title("Scale")
##w.config(bg="lightblue")
##
##v=DoubleVar()
##s=Scale(w, from_=1, to =100, variable=v, orient=HORIZONTAL)
##s.pack(anchor=CENTER)
##
##def select():
##    result='value='+str(v.get())
##    l1.config(text=result)
##
##b=Button(w, text="value", command=select)
##b.pack(anchor=CENTER, pady=40)
##
##l1=Label(w, text="measurment")
##l1.pack()
##
##w.mainloop()


#................................................Scrollbar...............................................
##from tkinter import*
##w=Tk()
##w.geometry("400x400")
##w.title("Scrollbar")
##
##scrollbar=Scrollbar(w)
##scrollbar.pack(side=RIGHT, fill=Y)
##mylist=Listbox(w, yscrollcommand=scrollbar.set)
##for line in range(100):
##    mylist.insert(END, "This is line number" +str(line))
##mylist.pack(side=LEFT, fill=BOTH)
##scrollbar.config(command=mylist.yview)
##w.mainloop()


#..........................................................Text..............................................
##from tkinter import*
##w=Tk()
##w.geometry("500x400")
##w.title("Text")
##
##y=Scrollbar(w, orient=VERTICAL)
##y.pack(side=RIGHT, fill =Y)
##x=Scrollbar(w, orient=HORIZONTAL)
##x.pack(side=BOTTOM, fill=X)
##t=Text(w, height=500, width=500, yscrollcommand=y.set,
##       xscrollcommand=x.set, wrap='none')
##for i in range(50):
##    t.insert(END, '\n Graphical User Interface Tkinter python programming')
##
##y.config(command=t.yview)
##x.config(command=t.xview)
##t.pack()
##
##w.mainloop()


#...........................................Spinbox...............................................
##from tkinter import*
##w=Tk()
##w.geometry("400x400")
##w.title("Spinbox")
##spin=Spinbox(w, from_=0, to=25, font=20)
##spin.pack()
##w.mainloop()


#...................................Message........................................
##from tkinter import*
##w=Tk()
##w.geometry("400x400")
##w.title("Message")
##v=StringVar()
##m=Message(w, textvariable=v, relief=RAISED, padx=50, pady=50)
##v.set("Hey! Good Morning")
##m.pack()
##w.mainloop()


#...........................................Canvas.......................................
'''from  tkinter import*
w=Tk()
w.geometry("700x400")
c=Canvas(w, bg="blue", height=350, width=600)
coord=(80, 60, 240, 240)
arc=c.create_arc(coord, start=0,extent=350, fill="red")
c.pack()
w.mainloop()'''


#................................................Frame.....................................................
##from tkinter import*
##w=Tk()
##w.geometry("400x400")
##w.title("Frame")
##
##frame=Frame(w)
##frame.pack()
####bottomframe=Frame(w)
####bottomframe.pack(side=BOTTOM)
##redbutton=Button(frame, text="Red", fg="red")
##redbutton.pack(side=LEFT)
##greenbutton=Button(frame, text='Brown', fg="brown")
##greenbutton.pack(side=LEFT)
##bluebutton=Button(frame, text='Blue', fg='blue')
##bluebutton.pack(side=LEFT)
##blackbutton=Button(frame, text='Black', fg='black')
##blackbutton.pack(side=BOTTOM)
##w.mainloop()


#...................................Toplevel...............................................
##from tkinter import*
##w=Tk()
##w.geometry("600x600")
##w.title("Toplevel")
##t=Toplevel()
##t.title("Python")
##w.mainloop()


'''from tkinter import*
w=Tk()
def qus1():
    w.withdraw()
    global t
    t=Toplevel()
    t.config(bg="pink")
    t.geometry('600x600')
    l=Label(t, text='1. What is the orange part of theegg is called ?',
            bg='pink', font=('link free', 14))
    l.place(x=20,y=10)

    global r
    r=StringVar()
    r1=Radiobutton(t, text='York', font=('times', 14), bg='pink', value='York',
                   variable=r, tristatevalue=0).place(x=55,y=45)
    r2=Radiobutton(t, text='Yolk', font=('times', 14), bg='pink', value='Yolk',
                   variable=r, tristatevalue=0).place(x=130, y=45)
    r3=Radiobutton(t, text='Woke', font=('times', 14), bg='pink', value='Woke',
                   variable=r, tristatevalue=0).place(x=210, y=45)
    r3nxtbutn=Button(t, text='Next', padx=11, pady=11, bg='yellow',
                     font=('times', 14), command=qus2).place(x=450, y=500)
def qus2():
    t.withdraw()
    global t1
    t1=Toplevel()
    t1.config(bg="blue")
    t1.geometry('600x600')
    t1=Label(t1, text='Hello welcome to all', bg='blue', font=('times',14))
    t1.place(x=20, y=10)

w.geometry('600x600')
w.config(bg='green')
b=Button(w, text='start', font=('times', 14), command=qus1).place(x=100, y=100)
w.mainloop()'''
    


#........................................Image.............................................
from tkinter import*
from PIL import Image,ImageTk
w=Tk()
w.geometry("500x500")
w.resizable(0,0)
img=Image.open("im.jpg")
resiz=img.resize((500,500))
dis=ImageTk.PhotoImage(resiz)
la=Label(w,image=dis).pack()
lab=Label(w,text="Picture").pack()
w.mainloop()


#...........................................delete item in combo box........................................
##import tkinter as tk
##def remove_item():
##    selection=listbox.curselection()    # get the index of the selected item
##    if selection:           # check if any item is selected
##        index=selection[0]      # get the first selected item's index
##        listbox.delete(index)   # delete the item at the specifed index
##w=tk.Tk()
##w.geometry('300x200')
##
##listbox=tk.Listbox(w)
##listbox.pack(pady=10)
##
##for item in ['Item 1', 'Item 2', 'Item 3']:     #   insert item into list box
##    listbox.insert(tk.END, item)
##
##remove_button=tk.Button(w, text="Remove item", command=remove_item)
##remove_button.pack()
##w.mainloop()



#.........................................Combobox delete...................................
##import tkinter as tk
##from tkinter import ttk
##def remove_item():
##    index=combobox.current()
##    if index != -1:
##        combobox['values']=combobox['values'][:index]+combobox['values'][index+1:]   #remove from the values
##        combobox.current(max(0,index-1))    # move the selection to the previous item
##root=tk.Tk()
##root.geometry("300x200")
##combobox=ttk.Combobox(root, values=['Item 1', 'Item 2', 'Item 3'])
##combobox.pack(pady=10)
##
##remove_button=tk.Button(root, text='Remove item', command=remove_item)
##remove_button.pack()
##root.mainloop()












