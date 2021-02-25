module gateleveland();

reg a;
reg b;
wire c;
wire d;
wire e;
wire f;
wire y;

nor(c,a,b);
nor(d,c,a);
nor(e,c,b);
nor(y,e,d);

initial
begin
     $monitor("a=%b, b=%b,y=%b",a,b,y);

     a = 0; b = 0; #10;
     a = 0; b = 1; #10;
     a = 1; b = 0; #10;
     a = 1; b = 1; #10;
     $finish;
end 
endmodule
