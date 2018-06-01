

//var p = /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[$@$!%*?&])[A-Za-z\d$@$!%*?&]{12,}/;
var p = /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[$@!%*?&§+#=><^:;.?/'"`~àéèçù()\-\[\]{}£¤€|_°²¨])[A-Za-z\d$@!%*?&§+#=><^:;.?/'"`~àéèçù()\-\[\]{}£¤€|_°²¨]{12,}/;
//var p = /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[$@$!%*?&])[A-Za-z\d$@$!%*?&]{12,}/;


WScript.echo( (p.test("A`1rtyuiopqs") ? "ok" : "ko") );
/*WScript.echo( (p.test("Aa1rtyuiopqs") ? "ok" : "ko") );
WScript.echo( (p.test("123") ? "ok" : "ko") );
WScript.echo( (p.test("azerty") ? "ok" : "ko") );
WScript.echo( (p.test("A@1rtyuiopqs") ? "ok --> @" : "ko --> @") );
WScript.echo( (p.test("A§1rtyuiopqs") ? "ok --> §" : "ko --> §") );
WScript.echo( (p.test("A+1rtyuiopqs") ? "ok --> +" : "ko --> +") );
WScript.echo( (p.test("A#1rtyuiopqs") ? "ok --> #" : "ko --> #") );
WScript.echo( (p.test("A=1rtyuiopqs") ? "ok --> =" : "ko --> =") );
WScript.echo( (p.test("A>1rtyuiopqs") ? "ok --> >" : "ko --> >") );
WScript.echo( (p.test("A^1rtyuiopqs") ? "ok --> ^" : "ko --> ^") );
WScript.echo( (p.test("A;1rtyuiopqs") ? "ok --> ;" : "ko --> ;") );
WScript.echo( (p.test("Aà1rtyuiopqs") ? "ok --> à" : "ko --> à") );*/

var q= /^(?=.*[a-z])(?=.*[^a-z\s])^\S{12,}$/;
//WScript.echo( (q.test("A@1rtyuiopqs") ? "ok avec q pour @" : "ko avec q pour @") );
WScript.echo( (q.test("Aa1rtyuiopqs") ? "ok avec q" : "ko avec q") );
/*WScript.echo( (q.test("123") ? "ok avec q" : "ko avec q") );
WScript.echo( (q.test("azerty") ? "ok avec q" : "ko avec q") );
WScript.echo( (q.test("A@1rtyuiopqs") ? "ok --> avec q @" : "ko --> avec q @") );
WScript.echo( (q.test("A§1rtyuiopqs") ? "ok --> avec q §" : "ko --> avec q §") );
WScript.echo( (q.test("A+1rtyuiopqs") ? "ok --> avec q +" : "ko --> avec q +") );
WScript.echo( (q.test("A#1rtyuiopqs") ? "ok --> avec q #" : "ko --> avec q #") );
WScript.echo( (q.test("A=1rtyuiopqs") ? "ok --> avec q =" : "ko --> avec q =") );
WScript.echo( (q.test("A>1rtyuiopqs") ? "ok --> avec q >" : "ko --> avec q >") );
WScript.echo( (q.test("A^1rtyuiopqs") ? "ok --> avec q ^" : "ko --> avec q ^") );
WScript.echo( (q.test("A;1rtyuiopqs") ? "ok --> avec q ;" : "ko --> avec q ;") );
WScript.echo( (q.test("Aà1rtyuiopqs") ? "ok --> avec q à" : "ko --> avec q à") );*/