// Description: Java 11 JavaFX Display Element Factory for NmTokensCol.

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
 *	CFBamJavaFXNmTokensColFactory JavaFX Display Element Factory
 *	for NmTokensCol.
 */
public class CFBamJavaFXNmTokensColFactory
implements ICFBamJavaFXNmTokensColFactory
{
	protected ICFBamJavaFXSchema javafxSchema = null;

	public CFBamJavaFXNmTokensColFactory( ICFBamJavaFXSchema argSchema ) {
		final String S_ProcName = "construct-schema";
		if( argSchema == null ) {
			throw new CFLibNullArgumentException( this.getClass(),
				S_ProcName,
				1,
				"argSchema" );
		}
		javafxSchema = argSchema;
	}

	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamNmTokensColObj argFocus ) {
		CFBamJavaFXNmTokensColAttrPane retnew = new CFBamJavaFXNmTokensColAttrPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamTableObj argContainer,
		ICFBamNmTokensColObj argFocus,
		Collection<ICFBamNmTokensColObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain )
	{
		CFBamJavaFXNmTokensColListPane retnew = new CFBamJavaFXNmTokensColListPane( formManager,
			javafxSchema,
			argContainer,
			argFocus,
			argDataCollection,
			refreshCallback,
			sortByChain );
		return( retnew );
	}

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamNmTokensColObj argFocus,
		ICFBamTableObj argContainer,
		Collection<ICFBamNmTokensColObj> argDataCollection,
		ICFBamJavaFXNmTokensColChosen whenChosen )
	{
		CFBamJavaFXNmTokensColPickerPane retnew = new CFBamJavaFXNmTokensColPickerPane( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFTabPane newEltTabPane( ICFFormManager formManager, ICFBamNmTokensColObj argFocus ) {
		CFBamJavaFXNmTokensColEltTabPane retnew = new CFBamJavaFXNmTokensColEltTabPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newAddPane( ICFFormManager formManager, ICFBamNmTokensColObj argFocus ) {
		CFBamJavaFXNmTokensColAddPane retnew = new CFBamJavaFXNmTokensColAddPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newViewEditPane( ICFFormManager formManager, ICFBamNmTokensColObj argFocus ) {
		CFBamJavaFXNmTokensColViewEditPane retnew = new CFBamJavaFXNmTokensColViewEditPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamNmTokensColObj argFocus, ICFDeleteCallback callback ) {
		CFBamJavaFXNmTokensColAskDeleteForm retnew = new CFBamJavaFXNmTokensColAskDeleteForm( formManager, javafxSchema, argFocus, callback );
		return( retnew );
	}

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamNmTokensColObj argFocus,
		ICFBamTableObj argContainer,
		Collection<ICFBamNmTokensColObj> argDataCollection,
		ICFBamJavaFXNmTokensColChosen whenChosen )
	{
		CFBamJavaFXNmTokensColPickerForm retnew = new CFBamJavaFXNmTokensColPickerForm( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamNmTokensColObj argFocus, ICFFormClosedCallback closeCallback, boolean allowSave ) {
		CFBamJavaFXNmTokensColAddForm retnew = new CFBamJavaFXNmTokensColAddForm( formManager, javafxSchema, argFocus, closeCallback, allowSave );
		return( retnew );
	}

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamNmTokensColObj argFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd ) {
		CFBamJavaFXNmTokensColViewEditForm retnew = new CFBamJavaFXNmTokensColViewEditForm( formManager, javafxSchema, argFocus, closeCallback, cameFromAdd );
		return( retnew );
	}
}
