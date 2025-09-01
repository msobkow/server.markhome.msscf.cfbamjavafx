// Description: Java 11 JavaFX Display Element Factory for TZDateType.

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
 *	CFBamJavaFXTZDateTypeFactory JavaFX Display Element Factory
 *	for TZDateType.
 */
public class CFBamJavaFXTZDateTypeFactory
implements ICFBamJavaFXTZDateTypeFactory
{
	protected ICFBamJavaFXSchema javafxSchema = null;

	public CFBamJavaFXTZDateTypeFactory( ICFBamJavaFXSchema argSchema ) {
		final String S_ProcName = "construct-schema";
		if( argSchema == null ) {
			throw new CFLibNullArgumentException( this.getClass(),
				S_ProcName,
				1,
				"argSchema" );
		}
		javafxSchema = argSchema;
	}

	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamTZDateTypeObj argFocus ) {
		CFBamJavaFXTZDateTypeAttrPane retnew = new CFBamJavaFXTZDateTypeAttrPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamSchemaDefObj argContainer,
		ICFBamTZDateTypeObj argFocus,
		Collection<ICFBamTZDateTypeObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain )
	{
		CFBamJavaFXTZDateTypeListPane retnew = new CFBamJavaFXTZDateTypeListPane( formManager,
			javafxSchema,
			argContainer,
			argFocus,
			argDataCollection,
			refreshCallback,
			sortByChain );
		return( retnew );
	}

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamTZDateTypeObj argFocus,
		ICFBamSchemaDefObj argContainer,
		Collection<ICFBamTZDateTypeObj> argDataCollection,
		ICFBamJavaFXTZDateTypeChosen whenChosen )
	{
		CFBamJavaFXTZDateTypePickerPane retnew = new CFBamJavaFXTZDateTypePickerPane( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFTabPane newEltTabPane( ICFFormManager formManager, ICFBamTZDateTypeObj argFocus ) {
		CFBamJavaFXTZDateTypeEltTabPane retnew = new CFBamJavaFXTZDateTypeEltTabPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newAddPane( ICFFormManager formManager, ICFBamTZDateTypeObj argFocus ) {
		CFBamJavaFXTZDateTypeAddPane retnew = new CFBamJavaFXTZDateTypeAddPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newViewEditPane( ICFFormManager formManager, ICFBamTZDateTypeObj argFocus ) {
		CFBamJavaFXTZDateTypeViewEditPane retnew = new CFBamJavaFXTZDateTypeViewEditPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamTZDateTypeObj argFocus, ICFDeleteCallback callback ) {
		CFBamJavaFXTZDateTypeAskDeleteForm retnew = new CFBamJavaFXTZDateTypeAskDeleteForm( formManager, javafxSchema, argFocus, callback );
		return( retnew );
	}

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamTZDateTypeObj argFocus,
		ICFBamSchemaDefObj argContainer,
		Collection<ICFBamTZDateTypeObj> argDataCollection,
		ICFBamJavaFXTZDateTypeChosen whenChosen )
	{
		CFBamJavaFXTZDateTypePickerForm retnew = new CFBamJavaFXTZDateTypePickerForm( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamTZDateTypeObj argFocus, ICFFormClosedCallback closeCallback, boolean allowSave ) {
		CFBamJavaFXTZDateTypeAddForm retnew = new CFBamJavaFXTZDateTypeAddForm( formManager, javafxSchema, argFocus, closeCallback, allowSave );
		return( retnew );
	}

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamTZDateTypeObj argFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd ) {
		CFBamJavaFXTZDateTypeViewEditForm retnew = new CFBamJavaFXTZDateTypeViewEditForm( formManager, javafxSchema, argFocus, closeCallback, cameFromAdd );
		return( retnew );
	}
}
