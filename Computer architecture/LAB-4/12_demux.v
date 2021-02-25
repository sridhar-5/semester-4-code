module demux_12();

reg S;
reg D;
wire Y0;
wire Y1;
wire not_out;

not(not_out,S);
and(Y0,not_out,D);
and(Y1,S,D);

initial
begin
  $monitor("S=%b, D=%b, Y1=%b, Y0=%b", S, D, Y1, Y0);

  S = 0; D = 0; #10;
  S = 0; D = 1; #10;
  S = 1; D = 0; #10;
  S = 1; D = 1; #10;
  $finish;
end
endmodule
