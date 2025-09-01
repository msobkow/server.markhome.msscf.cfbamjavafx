// Description: Java 11 JavaFX Display Element Factory for UInt64Def.

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
 *	CFBamJavaFXUInt64DefFactory JavaFX Display Element Factory
 *	for UInt64Def.
 */
public class CFBamJavaFXUInt64DefFactory
implements ICFBamJavaFXUInt64DefFactory
{
	protected ICFBamJavaFXSchema javafxSchema = null;

	public CFBamJavaFXUInt64DefFactory( ICFBamJavaFXSchema argSchema ) {
		final String S_ProcName = "construct-schema";
		if( argSchema == null ) {
			throw new CFLibNullArgumentException( this.getClass(),
				S_ProcName,
				1,
				"argSchema" );
		}
		javafxSchema = argSchema;
	}

	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamUInt64DefObj argFocus ) {
		CFBamJavaFXUInt64DefAttrPane retnew = new CFBamJavaFXUInt64DefAttrPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamScopeObj argContainer,
		ICFBamUInt64DefObj argFocus,
		Collection<ICFBamUInt64DefObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain )
	{
		CFBamJavaFXUInt64DefListPane retnew = new CFBamJavaFXUInt64DefListPane( formManager,
			javafxSchema,
			argContainer,
			argFocus,
			argDataCollection,
			refreshCallback,
			sortByChain );
		return( retnew );
	}

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamUInt64DefObj argFocus,
		ICFBamScopeObj argContainer,
		Collection<ICFBamUInt64DefObj> argDataCollection,
		ICFBamJavaFXUInt64DefChosen whenChosen )
	{
		CFBamJavaFXUInt64DefPickerPane retnew = new CFBamJavaFXUInt64DefPickerPane( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFTabPane newEltTabPane( ICFFormManager formManager, ICFBamUInt64DefObj argFocus ) {
		CFBamJavaFXUInt64DefEltTabPane retnew = new CFBamJavaFXUInt64DefEltTabPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newAddPane( ICFFormManager formManager, ICFBamUInt64DefObj argFocus ) {
		CFBamJavaFXUInt64DefAddPane retnew = new CFBamJavaFXUInt64DefAddPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newViewEditPane( ICFFormManager formManager, ICFBamUInt64DefObj argFocus ) {
		CFBamJavaFXUInt64DefViewEditPane retnew = new CFBamJavaFXUInt64DefViewEditPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamUInt64DefObj argFocus, ICFDeleteCallback callback ) {
		CFBamJavaFXUInt64DefAskDeleteForm retnew = new CFBamJavaFXUInt64DefAskDeleteForm( formManager, javafxSchema, argFocus, callback );
		return( retnew );
	}

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamUInt64DefObj argFocus,
		ICFBamScopeObj argContainer,
		Collection<ICFBamUInt64DefObj> argDataCollection,
		ICFBamJavaFXUInt64DefChosen whenChosen )
	{
		CFBamJavaFXUInt64DefPickerForm retnew = new CFBamJavaFXUInt64DefPickerForm( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamUInt64DefObj argFocus, ICFFormClosedCallback closeCallback, boolean allowSave ) {
		CFBamJavaFXUInt64DefAddForm retnew = new CFBamJavaFXUInt64DefAddForm( formManager, javafxSchema, argFocus, closeCallback, allowSave );
		return( retnew );
	}

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamUInt64DefObj argFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd ) {
		CFBamJavaFXUInt64DefViewEditForm retnew = new CFBamJavaFXUInt64DefViewEditForm( formManager, javafxSchema, argFocus, closeCallback, cameFromAdd );
		return( retnew );
	}
}
