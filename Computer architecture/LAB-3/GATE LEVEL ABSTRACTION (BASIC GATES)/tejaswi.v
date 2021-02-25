module gatelevel3();

reg a;
reg b;
reg c;
reg d;

wire e;
wire f;
wire g;
wire m;
wire h;
wire i;
wire z;

xor(e,b,d);
and(f,b,c);
or(g,c,d);
not(m,g);
or(h,a,m);
or(i,f,e);
xor(z,h,i);

initial
begin
    $monitor("a=%b, b=%b, c=%b, d=%b, z=%b",a,b,c,d,z);
    a = 0;b = 0;c = 0;d = 0;#10;
    a = 0;b = 0;c = 0;d = 1;#10;
    a = 0;b = 0;c = 1;d = 0;#10;
    a = 0;b = 0;c = 1;d = 1;#10;
    a = 0;b = 1;c = 0;d = 0;#10;
    a = 0;b = 1;c = 0;d = 1;#10;
    a = 0;b = 1;c = 1;d = 0;#10;
    a = 0;b = 1;c = 1;d = 1;#10;
    a = 1;b = 0;c = 0;d = 0;#10;
    a = 1;b = 0;c = 0;d = 1;#10;
    a = 1;b = 0;c = 1;d = 0;#10;
    a = 1;b = 0;c = 1;d = 1;#10;
    a = 1;b = 1;c = 0;d = 0;#10;
    a = 1;b = 1;c = 0;d = 1;#10;
    a = 1;b = 1;c = 1;d = 0;#10;
    a = 1;b = 1;c = 1;d = 1;#10;
    $finish;
end
endmodule
