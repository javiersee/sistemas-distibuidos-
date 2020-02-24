/*
 * This is sample code generated by rpcgen.
 * These are only templates and you can use them
 * as a guideline for developing your own functions.
 */

#include "notificaciones.h"


void
gestion_notificaciones_2(char *host)
{
	CLIENT *clnt;
	bool_t  *result_1;
	alerta  enviarnotificaciones_2_2_arg;

#ifndef	DEBUG
	clnt = clnt_create (host, gestion_notificaciones, gestion_notificaciones_version, "udp");
	if (clnt == NULL) {
		clnt_pcreateerror (host);
		exit (1);
	}
#endif	/* DEBUG */

	result_1 = enviarnotificaciones_2_2(&enviarnotificaciones_2_2_arg, clnt);
	if (result_1 == (bool_t *) NULL) {
		clnt_perror (clnt, "call failed");
	}
#ifndef	DEBUG
	clnt_destroy (clnt);
#endif	 /* DEBUG */
}


int
main (int argc, char *argv[])
{
	char *host;

	if (argc < 2) {
		printf ("usage: %s server_host\n", argv[0]);
		exit (1);
	}
	host = argv[1];
	gestion_notificaciones_2 (host);
exit (0);
}
