module gatelevelnot();

reg a;
reg b;
wire y;

not(y,a);
initial
begin
	$monitor("a=%b, y=%b",a,y);

	a = 1; #10;
	a = 0; #10;
	$finish;
end
endmodule
	