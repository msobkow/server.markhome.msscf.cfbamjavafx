// Description: Java 11 JavaFX Display Element Factory for NmTokensDef.

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
 *	CFBamJavaFXNmTokensDefFactory JavaFX Display Element Factory
 *	for NmTokensDef.
 */
public class CFBamJavaFXNmTokensDefFactory
implements ICFBamJavaFXNmTokensDefFactory
{
	protected ICFBamJavaFXSchema javafxSchema = null;

	public CFBamJavaFXNmTokensDefFactory( ICFBamJavaFXSchema argSchema ) {
		final String S_ProcName = "construct-schema";
		if( argSchema == null ) {
			throw new CFLibNullArgumentException( this.getClass(),
				S_ProcName,
				1,
				"argSchema" );
		}
		javafxSchema = argSchema;
	}

	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamNmTokensDefObj argFocus ) {
		CFBamJavaFXNmTokensDefAttrPane retnew = new CFBamJavaFXNmTokensDefAttrPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamScopeObj argContainer,
		ICFBamNmTokensDefObj argFocus,
		Collection<ICFBamNmTokensDefObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain )
	{
		CFBamJavaFXNmTokensDefListPane retnew = new CFBamJavaFXNmTokensDefListPane( formManager,
			javafxSchema,
			argContainer,
			argFocus,
			argDataCollection,
			refreshCallback,
			sortByChain );
		return( retnew );
	}

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamNmTokensDefObj argFocus,
		ICFBamScopeObj argContainer,
		Collection<ICFBamNmTokensDefObj> argDataCollection,
		ICFBamJavaFXNmTokensDefChosen whenChosen )
	{
		CFBamJavaFXNmTokensDefPickerPane retnew = new CFBamJavaFXNmTokensDefPickerPane( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFTabPane newEltTabPane( ICFFormManager formManager, ICFBamNmTokensDefObj argFocus ) {
		CFBamJavaFXNmTokensDefEltTabPane retnew = new CFBamJavaFXNmTokensDefEltTabPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newAddPane( ICFFormManager formManager, ICFBamNmTokensDefObj argFocus ) {
		CFBamJavaFXNmTokensDefAddPane retnew = new CFBamJavaFXNmTokensDefAddPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newViewEditPane( ICFFormManager formManager, ICFBamNmTokensDefObj argFocus ) {
		CFBamJavaFXNmTokensDefViewEditPane retnew = new CFBamJavaFXNmTokensDefViewEditPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamNmTokensDefObj argFocus, ICFDeleteCallback callback ) {
		CFBamJavaFXNmTokensDefAskDeleteForm retnew = new CFBamJavaFXNmTokensDefAskDeleteForm( formManager, javafxSchema, argFocus, callback );
		return( retnew );
	}

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamNmTokensDefObj argFocus,
		ICFBamScopeObj argContainer,
		Collection<ICFBamNmTokensDefObj> argDataCollection,
		ICFBamJavaFXNmTokensDefChosen whenChosen )
	{
		CFBamJavaFXNmTokensDefPickerForm retnew = new CFBamJavaFXNmTokensDefPickerForm( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamNmTokensDefObj argFocus, ICFFormClosedCallback closeCallback, boolean allowSave ) {
		CFBamJavaFXNmTokensDefAddForm retnew = new CFBamJavaFXNmTokensDefAddForm( formManager, javafxSchema, argFocus, closeCallback, allowSave );
		return( retnew );
	}

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamNmTokensDefObj argFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd ) {
		CFBamJavaFXNmTokensDefViewEditForm retnew = new CFBamJavaFXNmTokensDefViewEditForm( formManager, javafxSchema, argFocus, closeCallback, cameFromAdd );
		return( retnew );
	}
}
