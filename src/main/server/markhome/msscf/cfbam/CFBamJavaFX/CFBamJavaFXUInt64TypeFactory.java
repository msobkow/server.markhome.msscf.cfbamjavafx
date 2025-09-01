// Description: Java 11 JavaFX Display Element Factory for UInt64Type.

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
 *	CFBamJavaFXUInt64TypeFactory JavaFX Display Element Factory
 *	for UInt64Type.
 */
public class CFBamJavaFXUInt64TypeFactory
implements ICFBamJavaFXUInt64TypeFactory
{
	protected ICFBamJavaFXSchema javafxSchema = null;

	public CFBamJavaFXUInt64TypeFactory( ICFBamJavaFXSchema argSchema ) {
		final String S_ProcName = "construct-schema";
		if( argSchema == null ) {
			throw new CFLibNullArgumentException( this.getClass(),
				S_ProcName,
				1,
				"argSchema" );
		}
		javafxSchema = argSchema;
	}

	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamUInt64TypeObj argFocus ) {
		CFBamJavaFXUInt64TypeAttrPane retnew = new CFBamJavaFXUInt64TypeAttrPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamSchemaDefObj argContainer,
		ICFBamUInt64TypeObj argFocus,
		Collection<ICFBamUInt64TypeObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain )
	{
		CFBamJavaFXUInt64TypeListPane retnew = new CFBamJavaFXUInt64TypeListPane( formManager,
			javafxSchema,
			argContainer,
			argFocus,
			argDataCollection,
			refreshCallback,
			sortByChain );
		return( retnew );
	}

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamUInt64TypeObj argFocus,
		ICFBamSchemaDefObj argContainer,
		Collection<ICFBamUInt64TypeObj> argDataCollection,
		ICFBamJavaFXUInt64TypeChosen whenChosen )
	{
		CFBamJavaFXUInt64TypePickerPane retnew = new CFBamJavaFXUInt64TypePickerPane( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFTabPane newEltTabPane( ICFFormManager formManager, ICFBamUInt64TypeObj argFocus ) {
		CFBamJavaFXUInt64TypeEltTabPane retnew = new CFBamJavaFXUInt64TypeEltTabPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newAddPane( ICFFormManager formManager, ICFBamUInt64TypeObj argFocus ) {
		CFBamJavaFXUInt64TypeAddPane retnew = new CFBamJavaFXUInt64TypeAddPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newViewEditPane( ICFFormManager formManager, ICFBamUInt64TypeObj argFocus ) {
		CFBamJavaFXUInt64TypeViewEditPane retnew = new CFBamJavaFXUInt64TypeViewEditPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamUInt64TypeObj argFocus, ICFDeleteCallback callback ) {
		CFBamJavaFXUInt64TypeAskDeleteForm retnew = new CFBamJavaFXUInt64TypeAskDeleteForm( formManager, javafxSchema, argFocus, callback );
		return( retnew );
	}

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamUInt64TypeObj argFocus,
		ICFBamSchemaDefObj argContainer,
		Collection<ICFBamUInt64TypeObj> argDataCollection,
		ICFBamJavaFXUInt64TypeChosen whenChosen )
	{
		CFBamJavaFXUInt64TypePickerForm retnew = new CFBamJavaFXUInt64TypePickerForm( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamUInt64TypeObj argFocus, ICFFormClosedCallback closeCallback, boolean allowSave ) {
		CFBamJavaFXUInt64TypeAddForm retnew = new CFBamJavaFXUInt64TypeAddForm( formManager, javafxSchema, argFocus, closeCallback, allowSave );
		return( retnew );
	}

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamUInt64TypeObj argFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd ) {
		CFBamJavaFXUInt64TypeViewEditForm retnew = new CFBamJavaFXUInt64TypeViewEditForm( formManager, javafxSchema, argFocus, closeCallback, cameFromAdd );
		return( retnew );
	}
}
