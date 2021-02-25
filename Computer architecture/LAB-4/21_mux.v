module mux_21();

reg A;
reg B;
reg S;
wire T1;
wire T2;
wire Sbar;
wire Y;

and (T1, B, S), (T2, A, Sbar);
not (Sbar, S);
or (Y, T1, T2);

initial
begin
  $monitor("S=%b, D0=%b, D1=%b, Y=%b", S, A, B, Y);

  S = 0; A = 0; B = 0; #10;
  S = 0; A = 0; B = 1; #10;
  S = 0; A = 1; B = 0; #10;
  S = 0; A = 1; B = 1; #10;
  S = 1; A = 0; B = 0; #10;
  S = 1; A = 0; B = 1; #10;
  S = 1; A = 1; B = 0; #10;
  S = 1; A = 1; B = 1; #10;
  $finish;
end
endmodule
