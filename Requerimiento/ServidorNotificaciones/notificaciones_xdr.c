/*
 * Please do not edit this file.
 * It was generated using rpcgen.
 */

#include "notificaciones.h"

bool_t
xdr_ultimaAlerta (XDR *xdrs, ultimaAlerta *objp)
{
	register int32_t *buf;

	int i;
	 if (!xdr_vector (xdrs, (char *)objp->hora, 15,
		sizeof (char), (xdrproc_t) xdr_char))
		 return FALSE;
	 if (!xdr_vector (xdrs, (char *)objp->fecha, 15,
		sizeof (char), (xdrproc_t) xdr_char))
		 return FALSE;
	 if (!xdr_int (xdrs, &objp->puntuacion))
		 return FALSE;
	return TRUE;
}

bool_t
xdr_presionArterial2 (XDR *xdrs, presionArterial2 *objp)
{
	register int32_t *buf;

	 if (!xdr_int (xdrs, &objp->sistolica))
		 return FALSE;
	 if (!xdr_int (xdrs, &objp->diastolica))
		 return FALSE;
	return TRUE;
}

bool_t
xdr_nodo_indicadores2 (XDR *xdrs, nodo_indicadores2 *objp)
{
	register int32_t *buf;

	 if (!xdr_int (xdrs, &objp->frecuenciaCardiaca))
		 return FALSE;
	 if (!xdr_presionArterial2 (xdrs, &objp->sPresionArterial))
		 return FALSE;
	 if (!xdr_int (xdrs, &objp->frecuenciaRespiratoria))
		 return FALSE;
	 if (!xdr_float (xdrs, &objp->temperatura))
		 return FALSE;
	 if (!xdr_int (xdrs, &objp->saturacionOxigeno))
		 return FALSE;
	return TRUE;
}

bool_t
xdr_nodo_paciente2 (XDR *xdrs, nodo_paciente2 *objp)
{
	register int32_t *buf;

	int i;
	 if (!xdr_vector (xdrs, (char *)objp->nombres, MAXNOM,
		sizeof (char), (xdrproc_t) xdr_char))
		 return FALSE;
	 if (!xdr_float (xdrs, &objp->edad))
		 return FALSE;
	 if (!xdr_int (xdrs, &objp->numHabitacion))
		 return FALSE;
	 if (!xdr_nodo_indicadores2 (xdrs, &objp->indicadores))
		 return FALSE;
	return TRUE;
}

bool_t
xdr_indicador_genero_alerta (XDR *xdrs, indicador_genero_alerta *objp)
{
	register int32_t *buf;

	int i;
	 if (!xdr_vector (xdrs, (char *)objp->nombreIndicador, MAXNOM,
		sizeof (char), (xdrproc_t) xdr_char))
		 return FALSE;
	 if (!xdr_vector (xdrs, (char *)objp->valor, MAXNOM,
		sizeof (char), (xdrproc_t) xdr_char))
		 return FALSE;
	return TRUE;
}

bool_t
xdr_alerta (XDR *xdrs, alerta *objp)
{
	register int32_t *buf;

	int i;
	 if (!xdr_nodo_paciente2 (xdrs, &objp->paciente))
		 return FALSE;
	 if (!xdr_vector (xdrs, (char *)objp->hora, 15,
		sizeof (char), (xdrproc_t) xdr_char))
		 return FALSE;
	 if (!xdr_vector (xdrs, (char *)objp->fecha, 15,
		sizeof (char), (xdrproc_t) xdr_char))
		 return FALSE;
	 if (!xdr_vector (xdrs, (char *)objp->generoAlerta, 5,
		sizeof (indicador_genero_alerta), (xdrproc_t) xdr_indicador_genero_alerta))
		 return FALSE;
	 if (!xdr_vector (xdrs, (char *)objp->mensajeNotificaciones, 200,
		sizeof (char), (xdrproc_t) xdr_char))
		 return FALSE;
	 if (!xdr_vector (xdrs, (char *)objp->ultimasAlertas, 5,
		sizeof (ultimaAlerta), (xdrproc_t) xdr_ultimaAlerta))
		 return FALSE;
	return TRUE;
}