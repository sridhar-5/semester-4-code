module gateleveland();

reg a;
wire y;

nor(y,a,a);

initial
begin
     $monitor("a=%b,y=%b",a,y);
     a = 0; #10;
     a = 1; #10;
     $finish;
end 
endmodule
