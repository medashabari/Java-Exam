def  draw_spiral(t,n,l,a,b):
    theta = 0.0

    for i in range(n):
        t.fd(l)
        dtheta=1/(a+b*theta)
        t.lt(dtheta)
        theta+=dtheta

import turtle
bob=turtle.Turtle()
draw_spiral(bob,1000,3,0.1,0.0002)
turtle.mainloop()
print("EXECUTED BY M.SHABARISH_19X51A0594")
