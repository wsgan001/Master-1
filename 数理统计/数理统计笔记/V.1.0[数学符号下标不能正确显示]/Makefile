all:
paper:
	latex paper.tex
	bibtex paper
	latex paper.tex
	latex paper.tex
	dvipdfmx paper.dvi
ppt:
	pdflatex rmp_ppt.tex
	bibtex rmp_ppt
	pdflatex rmp_ppt.tex
	pdflatex rmp_ppt.tex
	gbk2uni rmp_ppt
	pdflatex rmp_ppt
	
p2:
	latex paper.tex
	dvipdfmx paper.dvi
ft:
	latex figuretest.tex
	dvipdfmx figuretest.dvi
clean:
	rm -f *~ *.pdf *.dvi *.log *.aux *.out *.ps *.mp *.mpo *.tui *.tuo *.tmp *.toc *-mpgraph.???? *.lof
