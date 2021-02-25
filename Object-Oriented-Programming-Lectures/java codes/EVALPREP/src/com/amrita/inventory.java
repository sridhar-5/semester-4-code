package com.amrita;

import java.util.*;
public class inventory {
    String item_name , ItemID;
    int price, stock,reorder_point , minimum_order,order_amount;

    inventory(String a,String b,int c,int d,int e,int f)
    {
        item_name=a;
        ItemID=b;
        price=c;
        stock=d;
        minimum_order=e;
        reorder_point=f;
        order_amount=0;
    }
    int search_name(String name,inventory [] objs,int n)
    {
        for(int i=0;i<n;i++)
        {
            if (objs[i].item_name.equals(name))
            {
                if(objs[i].reorder_point+objs[i].minimum_order > objs[i].stock)
                {
                    return 1;
                }
                return 0;

            }

        }
        return 0;

    }
    void order_amt(inventory [] objs,int n)
    {
        int sr;
        for(int i=0;i<n;i++)
        {
            sr=search_name(objs[i].item_name,objs,n);
            if(sr==1)
            {
                objs[i].order_amount=objs[i].reorder_point+objs[i].minimum_order- objs[i].stock+1;
                System.out.println(objs[i].item_name);

                System.out.println(objs[i].order_amount);
            }
        }
    }

    public static void main(String args[])
    {
        Scanner k = new Scanner(System.in);
        int n,p,s,r,m;
        String i_id,na;
        n=k.nextInt();
        inventory [] inventory = new inventory[n];

        for(int i=0;i<n;i++)
        {
            na=k.next();
            i_id=k.next();
            p=k.nextInt();
            s=k.nextInt();
            r=k.nextInt();
            m=k.nextInt();

            inventory[i]=new inventory(na,i_id,p,s,r,m);
        }
        inventory[0].order_amt(inventory,n);
    }

}