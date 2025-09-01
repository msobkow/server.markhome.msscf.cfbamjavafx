// Description: Java 11 JavaFX Display Element Factory for TZDateDef.

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
 *	CFBamJavaFXTZDateDefFactory JavaFX Display Element Factory
 *	for TZDateDef.
 */
public class CFBamJavaFXTZDateDefFactory
implements ICFBamJavaFXTZDateDefFactory
{
	protected ICFBamJavaFXSchema javafxSchema = null;

	public CFBamJavaFXTZDateDefFactory( ICFBamJavaFXSchema argSchema ) {
		final String S_ProcName = "construct-schema";
		if( argSchema == null ) {
			throw new CFLibNullArgumentException( this.getClass(),
				S_ProcName,
				1,
				"argSchema" );
		}
		javafxSchema = argSchema;
	}

	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamTZDateDefObj argFocus ) {
		CFBamJavaFXTZDateDefAttrPane retnew = new CFBamJavaFXTZDateDefAttrPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamScopeObj argContainer,
		ICFBamTZDateDefObj argFocus,
		Collection<ICFBamTZDateDefObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain )
	{
		CFBamJavaFXTZDateDefListPane retnew = new CFBamJavaFXTZDateDefListPane( formManager,
			javafxSchema,
			argContainer,
			argFocus,
			argDataCollection,
			refreshCallback,
			sortByChain );
		return( retnew );
	}

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamTZDateDefObj argFocus,
		ICFBamScopeObj argContainer,
		Collection<ICFBamTZDateDefObj> argDataCollection,
		ICFBamJavaFXTZDateDefChosen whenChosen )
	{
		CFBamJavaFXTZDateDefPickerPane retnew = new CFBamJavaFXTZDateDefPickerPane( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFTabPane newEltTabPane( ICFFormManager formManager, ICFBamTZDateDefObj argFocus ) {
		CFBamJavaFXTZDateDefEltTabPane retnew = new CFBamJavaFXTZDateDefEltTabPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newAddPane( ICFFormManager formManager, ICFBamTZDateDefObj argFocus ) {
		CFBamJavaFXTZDateDefAddPane retnew = new CFBamJavaFXTZDateDefAddPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newViewEditPane( ICFFormManager formManager, ICFBamTZDateDefObj argFocus ) {
		CFBamJavaFXTZDateDefViewEditPane retnew = new CFBamJavaFXTZDateDefViewEditPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamTZDateDefObj argFocus, ICFDeleteCallback callback ) {
		CFBamJavaFXTZDateDefAskDeleteForm retnew = new CFBamJavaFXTZDateDefAskDeleteForm( formManager, javafxSchema, argFocus, callback );
		return( retnew );
	}

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamTZDateDefObj argFocus,
		ICFBamScopeObj argContainer,
		Collection<ICFBamTZDateDefObj> argDataCollection,
		ICFBamJavaFXTZDateDefChosen whenChosen )
	{
		CFBamJavaFXTZDateDefPickerForm retnew = new CFBamJavaFXTZDateDefPickerForm( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamTZDateDefObj argFocus, ICFFormClosedCallback closeCallback, boolean allowSave ) {
		CFBamJavaFXTZDateDefAddForm retnew = new CFBamJavaFXTZDateDefAddForm( formManager, javafxSchema, argFocus, closeCallback, allowSave );
		return( retnew );
	}

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamTZDateDefObj argFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd ) {
		CFBamJavaFXTZDateDefViewEditForm retnew = new CFBamJavaFXTZDateDefViewEditForm( formManager, javafxSchema, argFocus, closeCallback, cameFromAdd );
		return( retnew );
	}
}
