// Description: Java 11 JavaFX Display Element Factory for IndexCol.

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
 *	CFBamJavaFXIndexColFactory JavaFX Display Element Factory
 *	for IndexCol.
 */
public class CFBamJavaFXIndexColFactory
implements ICFBamJavaFXIndexColFactory
{
	protected ICFBamJavaFXSchema javafxSchema = null;

	public CFBamJavaFXIndexColFactory( ICFBamJavaFXSchema argSchema ) {
		final String S_ProcName = "construct-schema";
		if( argSchema == null ) {
			throw new CFLibNullArgumentException( this.getClass(),
				S_ProcName,
				1,
				"argSchema" );
		}
		javafxSchema = argSchema;
	}

	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamIndexColObj argFocus ) {
		CFBamJavaFXIndexColAttrPane retnew = new CFBamJavaFXIndexColAttrPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamIndexObj argContainer,
		ICFBamIndexColObj argFocus,
		Collection<ICFBamIndexColObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain )
	{
		CFBamJavaFXIndexColListPane retnew = new CFBamJavaFXIndexColListPane( formManager,
			javafxSchema,
			argContainer,
			argFocus,
			argDataCollection,
			refreshCallback,
			sortByChain );
		return( retnew );
	}

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamIndexColObj argFocus,
		ICFBamIndexObj argContainer,
		Collection<ICFBamIndexColObj> argDataCollection,
		ICFBamJavaFXIndexColChosen whenChosen )
	{
		CFBamJavaFXIndexColPickerPane retnew = new CFBamJavaFXIndexColPickerPane( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFTabPane newEltTabPane( ICFFormManager formManager, ICFBamIndexColObj argFocus ) {
		CFBamJavaFXIndexColEltTabPane retnew = new CFBamJavaFXIndexColEltTabPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newAddPane( ICFFormManager formManager, ICFBamIndexColObj argFocus ) {
		CFBamJavaFXIndexColAddPane retnew = new CFBamJavaFXIndexColAddPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newViewEditPane( ICFFormManager formManager, ICFBamIndexColObj argFocus ) {
		CFBamJavaFXIndexColViewEditPane retnew = new CFBamJavaFXIndexColViewEditPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamIndexColObj argFocus, ICFDeleteCallback callback ) {
		CFBamJavaFXIndexColAskDeleteForm retnew = new CFBamJavaFXIndexColAskDeleteForm( formManager, javafxSchema, argFocus, callback );
		return( retnew );
	}

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamIndexColObj argFocus,
		ICFBamIndexObj argContainer,
		Collection<ICFBamIndexColObj> argDataCollection,
		ICFBamJavaFXIndexColChosen whenChosen )
	{
		CFBamJavaFXIndexColPickerForm retnew = new CFBamJavaFXIndexColPickerForm( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamIndexColObj argFocus, ICFFormClosedCallback closeCallback, boolean allowSave ) {
		CFBamJavaFXIndexColAddForm retnew = new CFBamJavaFXIndexColAddForm( formManager, javafxSchema, argFocus, closeCallback, allowSave );
		return( retnew );
	}

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamIndexColObj argFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd ) {
		CFBamJavaFXIndexColViewEditForm retnew = new CFBamJavaFXIndexColViewEditForm( formManager, javafxSchema, argFocus, closeCallback, cameFromAdd );
		return( retnew );
	}
}
