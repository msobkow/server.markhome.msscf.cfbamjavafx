// Description: Java 11 JavaFX Display Element Factory for UuidType.

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
 *	CFBamJavaFXUuidTypeFactory JavaFX Display Element Factory
 *	for UuidType.
 */
public class CFBamJavaFXUuidTypeFactory
implements ICFBamJavaFXUuidTypeFactory
{
	protected ICFBamJavaFXSchema javafxSchema = null;

	public CFBamJavaFXUuidTypeFactory( ICFBamJavaFXSchema argSchema ) {
		final String S_ProcName = "construct-schema";
		if( argSchema == null ) {
			throw new CFLibNullArgumentException( this.getClass(),
				S_ProcName,
				1,
				"argSchema" );
		}
		javafxSchema = argSchema;
	}

	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamUuidTypeObj argFocus ) {
		CFBamJavaFXUuidTypeAttrPane retnew = new CFBamJavaFXUuidTypeAttrPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamSchemaDefObj argContainer,
		ICFBamUuidTypeObj argFocus,
		Collection<ICFBamUuidTypeObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain )
	{
		CFBamJavaFXUuidTypeListPane retnew = new CFBamJavaFXUuidTypeListPane( formManager,
			javafxSchema,
			argContainer,
			argFocus,
			argDataCollection,
			refreshCallback,
			sortByChain );
		return( retnew );
	}

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamUuidTypeObj argFocus,
		ICFBamSchemaDefObj argContainer,
		Collection<ICFBamUuidTypeObj> argDataCollection,
		ICFBamJavaFXUuidTypeChosen whenChosen )
	{
		CFBamJavaFXUuidTypePickerPane retnew = new CFBamJavaFXUuidTypePickerPane( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFTabPane newEltTabPane( ICFFormManager formManager, ICFBamUuidTypeObj argFocus ) {
		CFBamJavaFXUuidTypeEltTabPane retnew = new CFBamJavaFXUuidTypeEltTabPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newAddPane( ICFFormManager formManager, ICFBamUuidTypeObj argFocus ) {
		CFBamJavaFXUuidTypeAddPane retnew = new CFBamJavaFXUuidTypeAddPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newViewEditPane( ICFFormManager formManager, ICFBamUuidTypeObj argFocus ) {
		CFBamJavaFXUuidTypeViewEditPane retnew = new CFBamJavaFXUuidTypeViewEditPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamUuidTypeObj argFocus, ICFDeleteCallback callback ) {
		CFBamJavaFXUuidTypeAskDeleteForm retnew = new CFBamJavaFXUuidTypeAskDeleteForm( formManager, javafxSchema, argFocus, callback );
		return( retnew );
	}

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamUuidTypeObj argFocus,
		ICFBamSchemaDefObj argContainer,
		Collection<ICFBamUuidTypeObj> argDataCollection,
		ICFBamJavaFXUuidTypeChosen whenChosen )
	{
		CFBamJavaFXUuidTypePickerForm retnew = new CFBamJavaFXUuidTypePickerForm( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamUuidTypeObj argFocus, ICFFormClosedCallback closeCallback, boolean allowSave ) {
		CFBamJavaFXUuidTypeAddForm retnew = new CFBamJavaFXUuidTypeAddForm( formManager, javafxSchema, argFocus, closeCallback, allowSave );
		return( retnew );
	}

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamUuidTypeObj argFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd ) {
		CFBamJavaFXUuidTypeViewEditForm retnew = new CFBamJavaFXUuidTypeViewEditForm( formManager, javafxSchema, argFocus, closeCallback, cameFromAdd );
		return( retnew );
	}
}
