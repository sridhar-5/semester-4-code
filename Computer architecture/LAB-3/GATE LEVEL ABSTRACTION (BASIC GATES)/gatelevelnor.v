module gatelevelnor();
reg a;
reg b;
wire y;

nor(y,a, b);
initial
begin
  $monitor("a=%b, b=%b, y=%b", a, b, y);
 
  a = 0; b = 0; #10;
  a = 0; b = 1; #10;
  a = 1; b = 0; #10;
  a = 1; b = 1; #10;
  $finish;
end
endmodule