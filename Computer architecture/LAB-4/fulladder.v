module gatelevel2();

reg c;
reg a;
reg b;

wire d;
wire e;
wire s;
wire f;
wire x;

xor(d,a,b);
and(e,a,b);
xor(s,d,c);
and(f,d,c);
or(x,e,f);



initial
begin
    $monitor("c=%b, a=%b, b=%b, carry=%b,sum=%b",c,a,b,x,s);
    a = 0;b = 0;c = 0;#10;
    a = 0;b = 0;c = 1;#10;
    a = 0;b = 1;c = 0;#10;
    a = 0;b = 1;c = 1;#10;
    a = 1;b = 0;c = 0;#10;
    a = 1;b = 0;c = 1;#10;
    a = 1;b = 1;c = 0;#10;
    a = 1;b = 1;c = 1;#10;
    $finish;
end
endmodule
