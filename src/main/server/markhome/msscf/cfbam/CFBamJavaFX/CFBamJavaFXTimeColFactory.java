// Description: Java 11 JavaFX Display Element Factory for TimeCol.

/*
 *	server.markhome.msscf.CFBam
 *
 *	Copyright (c) 2020-2025 Mark Stephen Sobkow
 *	
 *
 *	Manufactured by MSS Code Factory 2.13
 */

package server.markhome.msscf.cfbam.CFBamJavaFX;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.cflib.CFLib.*;
import org.msscf.msscf.cflib.CFLib.JavaFX.*;
import org.apache.commons.codec.binary.Base64;
import server.markhome.msscf.cfsec.CFSec.*;
import server.markhome.msscf.cfint.CFInt.*;
import server.markhome.msscf.cfbam.CFBam.*;
import server.markhome.msscf.cfsec.CFSecObj.*;
import server.markhome.msscf.cfint.CFIntObj.*;
import server.markhome.msscf.cfbam.CFBamObj.*;

/**
 *	CFBamJavaFXTimeColFactory JavaFX Display Element Factory
 *	for TimeCol.
 */
public class CFBamJavaFXTimeColFactory
implements ICFBamJavaFXTimeColFactory
{
	protected ICFBamJavaFXSchema javafxSchema = null;

	public CFBamJavaFXTimeColFactory( ICFBamJavaFXSchema argSchema ) {
		final String S_ProcName = "construct-schema";
		if( argSchema == null ) {
			throw new CFLibNullArgumentException( this.getClass(),
				S_ProcName,
				1,
				"argSchema" );
		}
		javafxSchema = argSchema;
	}

	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamTimeColObj argFocus ) {
		CFBamJavaFXTimeColAttrPane retnew = new CFBamJavaFXTimeColAttrPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamTableObj argContainer,
		ICFBamTimeColObj argFocus,
		Collection<ICFBamTimeColObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain )
	{
		CFBamJavaFXTimeColListPane retnew = new CFBamJavaFXTimeColListPane( formManager,
			javafxSchema,
			argContainer,
			argFocus,
			argDataCollection,
			refreshCallback,
			sortByChain );
		return( retnew );
	}

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamTimeColObj argFocus,
		ICFBamTableObj argContainer,
		Collection<ICFBamTimeColObj> argDataCollection,
		ICFBamJavaFXTimeColChosen whenChosen )
	{
		CFBamJavaFXTimeColPickerPane retnew = new CFBamJavaFXTimeColPickerPane( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFTabPane newEltTabPane( ICFFormManager formManager, ICFBamTimeColObj argFocus ) {
		CFBamJavaFXTimeColEltTabPane retnew = new CFBamJavaFXTimeColEltTabPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newAddPane( ICFFormManager formManager, ICFBamTimeColObj argFocus ) {
		CFBamJavaFXTimeColAddPane retnew = new CFBamJavaFXTimeColAddPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newViewEditPane( ICFFormManager formManager, ICFBamTimeColObj argFocus ) {
		CFBamJavaFXTimeColViewEditPane retnew = new CFBamJavaFXTimeColViewEditPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamTimeColObj argFocus, ICFDeleteCallback callback ) {
		CFBamJavaFXTimeColAskDeleteForm retnew = new CFBamJavaFXTimeColAskDeleteForm( formManager, javafxSchema, argFocus, callback );
		return( retnew );
	}

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamTimeColObj argFocus,
		ICFBamTableObj argContainer,
		Collection<ICFBamTimeColObj> argDataCollection,
		ICFBamJavaFXTimeColChosen whenChosen )
	{
		CFBamJavaFXTimeColPickerForm retnew = new CFBamJavaFXTimeColPickerForm( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamTimeColObj argFocus, ICFFormClosedCallback closeCallback, boolean allowSave ) {
		CFBamJavaFXTimeColAddForm retnew = new CFBamJavaFXTimeColAddForm( formManager, javafxSchema, argFocus, closeCallback, allowSave );
		return( retnew );
	}

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamTimeColObj argFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd ) {
		CFBamJavaFXTimeColViewEditForm retnew = new CFBamJavaFXTimeColViewEditForm( formManager, javafxSchema, argFocus, closeCallback, cameFromAdd );
		return( retnew );
	}
}
