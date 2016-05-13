package com

import com.sun.tracing.dtrace.ModuleName
import org.w3c.dom.html.HTMLElement

import scala.scalajs.js
import scala.scalajs.js.UndefOr
import scala.scalajs.js.annotation._
import scala.scalajs.js.typedarray.Float32Array

package object blend4web {

  @JSName("b4w")
  @js.native
  object b4w extends js.Object{
    def require(moduleName: String): js.Object = js.native
  }

  val anchors = b4w.require("anchors").asInstanceOf[Anchors]
  
  @JSName("anchors")
  @js.native
  class Anchors extends js.Object {
    def attach_move_cb(obj: Object3D, anchor_move_cb: AnchorMoveCallback): Unit = js.native
    def detach_move_cb(obj: Object3D): Unit = js.native
    // Note, can return string or boolean...
    def get_element_id(obj: Object3D): js.Object = js.native
    def is_anchor(obj: Object3D): Boolean = js.native

  }

  // x, y, appearance ("visible", "out", "covered"), obj, anchor
  type AnchorMoveCallback = Function5[Double, Double, String, Object3D, UndefOr[HTMLElement], Any]

  type Object3D = js.Object

  @JSName("animation")
  @js.native
  class animation extends js.Object {

    val AB_CYCLIC: AnimBehavior = js.native
    val AB_FINISH_RESET: AnimBehavior = js.native
    val AB_FINISH_STOP: AnimBehavior = js.native
    val OBJ_ANIM_TYPE_ARMATURE: AnimType = js.native
    val OBJ_ANIM_TYPE_MATERIAL: AnimType = js.native
    val OBJ_ANIM_TYPE_NONE: AnimType = js.native
    val OBJ_ANIM_TYPE_OBJECT: AnimType = js.native
    val OBJ_ANIM_TYPE_PARTICLES: AnimType = js.native
    val OBJ_ANIM_TYPE_SOUND: AnimType = js.native
    val OBJ_ANIM_TYPE_VERTEX: AnimType = js.native
    val SLOT_0: AnimSlot = js.native
    val SLOT_1: AnimSlot = js.native
    val SLOT_2: AnimSlot = js.native
    val SLOT_3: AnimSlot = js.native
    val SLOT_4: AnimSlot = js.native
    val SLOT_5: AnimSlot = js.native
    val SLOT_6: AnimSlot = js.native
    val SLOT_7: AnimSlot = js.native
    val SLOT_ALL: AnimSlot = js.native

    // TODO - apply has special significance in Scala. Does it apply as well in this scenario?
    def apply(obj: Object3D, name: String, slot_numopt: AnimSlot = SLOT_0): Unit = js.native
    def apply_def(obj: Object3D): Unit = js.native
    def apply_smoothing(obj: Object3D, trans_periodopt: Double = 0, quat_periodopt: Double = 0, slot_numopt: Double = 0): Unit = js.native
    def apply_to_first_empty_slot(obj: Object3D, name: String): Int = js.native
    def frame_to_sec(frame: Int): Double = js.native
    def get_anim_length(obj: Object3D, slot_numopt: UndefOr[AnimSlot]): Int = js.native
    def get_anim_names(obj: Object3D): js.Array[String] = js.native
    def get_anim_start_frame(obj: Object3D, slot_numopt: UndefOr[AnimSlot]): Int = js.native

    // TODO - return type is (nullable) {module:animation~AnimType} in the docs. What does that mean?
    def get_anim_type(obj: Object3D, slot_numopt: UndefOr[AnimSlot]): AnimType = js.native
    def get_behavior(obj: Object3D, slot_numopt: UndefOr[AnimSlot]): AnimBehavior = js.native

    @deprecated("Use armature.get_bone_tsr instead")
    def get_bone_translation(armobj: Object3D, bone_name: String, destopt: UndefOr[Vec3]): Unit = js.native

    // TODO - return type is (nullable) {String} in the docs. What does this mean?
    def get_current_anim_name(obj: Object3D, slot_numopt: UndefOr[AnimSlot]): String = js.native
    def get_first_armature_object(obj: Object3D): Object3D = js.native
    def get_frame(obj: Object3D, slot_numopt: UndefOr[AnimSlot]): Int = js.native
    def get_skel_mix_factor(armobj: Object3D): Double = js.native
    def get_slot_num_by_anim(obj: Object3D, anim_name: String): Int = js.native
    def get_speed(obj: Object3D, slot_numopt: UndefOr[AnimSlot]): Double = js.native
    def is_animated(obj: Object3D): Boolean = js.native
    def is_play(obj: Object3D, slot_numopt: UndefOr[AnimSlot]): Boolean = js.native
    def play(obj: Object3D, finish_callbackopt: UndefOr[AnimFinishCallback], slot_numopt: UndefOr[AnimSlot]): Unit = js.native
    def remove(obj: Object3D): Unit = js.native
    def remove_slot_animation(obj: Object3D, slot_numopt: UndefOr[AnimSlot]): Unit = js.native
    def set_behavior(obj: Object3D, behavior: AnimBehavior, slot_numopt: UndefOr[AnimSlot]): Unit = js.native
    def set_first_frame(obj: Object3D, slot_numopt: UndefOr[AnimSlot]): Unit = js.native
    def set_frame(obj: Object3D, frame: Float, slot_numopt: UndefOr[AnimSlot]): Unit = js.native
    def set_last_frame(obj: Object3D, slot_numopt: UndefOr[AnimSlot]): Unit = js.native
    def set_skel_mix_factor(armobj: Object3D, factor: Double, timeopt: UndefOr[Double]): Unit = js.native
    def set_speed(obj: Object3D, speed: Float, slot_numopt: UndefOr[AnimSlot]): Unit = js.native
    def stop(obj: Object3D, slot_numopt: UndefOr[AnimSlot]): Unit = js.native

  }

  type AnimBehavior = Int
  type AnimFinishCallback = Function2[Object3D, AnimSlot, Any]
  type AnimSlot = Int
  type AnimType = Int

  type TSR = Float32Array
  type Vec2 = Float32Array
  type Vec3 = Float32Array
  type Vec4 = Float32Array

  @JSName("app")
  @js.native
  class app extends js.Object {

    def attr_animate(elem: HTMLElement, attr_name: String, from: Double, to: Double, timeout: Double, opt_callbackopt: UndefOr[GenericCallback]): Unit = js.native
    def check_fullscreen(): Boolean = js.native
    def css_animate(elem: HTMLElement, prop: String, from: Double, to: Double, timeout: Double, opt_prefixopt: UndefOr[String], opt_suffixopt: UndefOr[String], opt_callbackopt: UndefOr[GenericCallback]): Unit = js.native
    def disable_camera_controls(): Unit = js.native
    def disable_controls(): Unit = js.native
    def disable_object_controls(obj: Object3D): Unit = js.native
    def enable_camera_controls(disable_default_pivotopt: UndefOr[Boolean], disable_letter_controlsopt: UndefOr[Boolean], disable_zoomopt: UndefOr[Boolean], elementopt: UndefOr[HTMLElement], allow_element_exitopt: UndefOr[Boolean]): Unit = js.native
    def enable_controls(allow_element_exitopt: UndefOr[Boolean]): Unit = js.native
    def enable_debug_controls(): Unit = js.native
    def enable_object_controls(obj: Object3D, elementopt: UndefOr[HTMLElement]): Unit = js.native
    def exit_fullscreen(): Unit = js.native
    def get_camera_smooth_factor(): Double = js.native

    // TODO - if this returns information, it is in key value format apparently.
    def get_url_params(allow_param_arrayopt: UndefOr[Boolean]): js.Object = js.native


    def init(optionsopt: UndefOr[EngineConfig]): Unit = js.native
    def queue_animate(queue: js.Array[QueueObject]): Unit = js.native
    def report_app_error(text_message: String, link_message: String, link: String, purge_elements: js.Array[HTMLElement]): Unit = js.native
    def request_fullscreen(elem: HTMLElement, enabled_cb: FullscreenEnabledCallback, disabled_cb: FullscreenDisabledCallback): Unit = js.native

    @deprecated("use camera.static_setup or camera.eye_setup or camera.target_setup or camera.hover_setup or camera.hover_setup_rel instead.")
    def set_camera_move_style(move_style: CameraMoveStyle): Unit = js.native
    def set_camera_smooth_factor(value: Double): Unit = js.native

  }

  @ScalaJSDefined
  class EngineConfig extends js.Object {
    var canvas_container_id: UndefOr[String] = js.undefined
    var callback: UndefOr[AppInitCallback] = js.undefined
    var error_purge_elements: UndefOr[Boolean] = js.undefined
    var show_hud_debug_info: UndefOr[Boolean] = js.undefined
    var show_fps: UndefOr[Boolean] = js.undefined
    var fps_elem_id: UndefOr[String] = js.undefined
    var fps_wrapper_id: UndefOr[String] = js.undefined
    var report_init_failure: UndefOr[Boolean] = js.undefined
    var pause_invisible: UndefOr[Boolean] = js.undefined
    var key_pause_enabled: UndefOr[Boolean] = js.undefined
    var autoresize: UndefOr[Boolean] = js.undefined
    var force_container_ratio: UndefOr[Double] = js.undefined

  }

  type GenericCallback = Function0[Any]
  type AppInitCallback = Function2[HTMLElement, Boolean, Any]
  type FullscreenEnabledCallback = GenericCallback
  type FullscreenDisabledCallback = GenericCallback
  type CameraMoveStyle = Int

  //AnimFinishCallback()

  @ScalaJSDefined
  class QueueObject extends js.Object {
    var `type`: String = _
    var elem:	HTMLElement = _
    var prop:	String = _
    var from:	Double = _
    var to:	Double = _
    var duration: Double = _
    var opt_prefix: UndefOr[String] = js.undefined
    var opt_suffix: UndefOr[String] = js.undefined
    var cb: UndefOr[AnimFinishCallback] = js.undefined

  }

  @JSName("armature")
  @js.native
  class armature extends js.Object {
    def get_bone_tsr(armobj: Object3D, bone_name: String, destopt: UndefOr[TSR]): TSR = js.native
    def get_bone_tsr_rel(armobj: Object3D, bone_name: String, destopt: UndefOr[TSR]): TSR = js.native
    def set_bone_tsr(armobj: Object3D, bone_name: String, tsr: TSR): Unit = js.native
    def set_bone_tsr_rel(armobj: Object3D, bone_name: String, tsr: TSR): Unit = js.native
  }

  @JSName("assets")
  @js.native
  class assets extends js.Object {

    val AT_ARRAYBUFFER: Asset = js.native
    val AT_AUDIO_ELEMENT: Asset = js.native
    val AT_AUDIOBUFFER: Asset = js.native
    val AT_IMAGE_ELEMENT: Asset = js.native
    val AT_JSON: Asset = js.native
    val AT_TEXT: Asset = js.native

    def enqueue(assets_pack: js.Array[Asset], asset_cbopt: UndefOr[AssetCallback], pack_cbopt: UndefOr[PackCallback], progress_cbopt: UndefOr[ProgressCallback]): Unit = js.native

  }

  // TODO - Not documented very well. May want to come back and confirm
  type AssetCallback = Function5[js.Object, String, Double, String, UndefOr[String], Any]

  type Asset = js.Array[js.Object]
  // Note however that this array matches this structure:
  /*
    {
    val uri: String = js.native
    val `type`: String = js.native
    val filepath: String = js.native
    val optional_param: UndefOr[]
  }
  */
  type PackCallback = Function0[Any]
  type ProgressCallback = Function1[Double, Any]

  @JSName("camera")
  @js.native
  class camera extends js.Object {

    val MS_EYE_CONTROLS: CameraMoveStyle = js.native
    val MS_HOVER_CONTROLS: CameraMoveStyle = js.native
    val MS_STATIC: CameraMoveStyle = js.native
    val MS_TARGET_CONTROLS: CameraMoveStyle = js.native

    @deprecated("use camera.target_set_distance_limits or camera.hover_set_distance_limits instead.")
    def apply_distance_limits(camobj: Object3D, min: Double, max: Double): Unit = js.native

    @deprecated("use camera.eye_set_horizontal_limits, camera.target_set_horizontal_limits or camera.hover_set_horiz_trans_limits instead.")
    def apply_horizontal_limits(camobj: Object3D, left_value: Double, right_value: Double, spaceopt: UndefOr[Space]): Unit = js.native

    @deprecated("use camera.hover_set_vertical_limits instead.")
    def apply_hover_angle_limits(camobj: Object3D, down_angle: Double, up_angle: Double): Unit = js.native

    @deprecated("use camera.eye_set_vertical_limits, camera.target_set_vertical_limits or camera.hover_set_vert_trans_limits instead.")
    def apply_vertical_limits(camobj: Object3D, down_value: Double, up_value: Double, spaceopt: UndefOr[Space]): Unit = js.native

    def calc_ray(camobj: Object3D, canvas_x: Double, canvas_y: Double, destopt: UndefOr[ParametricLine]): ParametricLine = js.native

    @deprecated("use camera.target_set_distance_limits instead.")
    def clear_distance_limits(camobj: Object3D): Unit = js.native

    @deprecated("use camera.target_set_horizontal_limits, camera.eye_set_horizontal_limits or camera.hover_set_horiz_trans_limits with passing null as the \"limits\" argument.")
    def clear_horizontal_limits(camobj: Object3D): Unit = js.native

    @deprecated("don't have any advice here. Just don't use it, okay?")
    def clear_hover_angle_limits(camobj: Object3D): Unit = js.native

    @deprecated("use camera.target_set_vertical_limits, camera.eye_set_vertical_limits or camera.hover_set_vert_trans_limits with passing null as the \"limits\" argument.")
    def clear_vertical_limits(camobj: Object3D): Unit = js.native

    def correct_up(camobj: Object3D, y_axisopt: UndefOr[Vec3], strictopt: UndefOr[Boolean]): Unit = js.native
    def eye_get_horizontal_limits(camobj: Object3D, destopt: UndefOr[HorizontalRotationLimits], localopt: UndefOr[Boolean]): HorizontalRotationLimits = js.native
    def eye_get_vertical_limits(camobj: Object3D, destopt: UndefOr[VerticalRotationLimits], localopt: UndefOr[Boolean]): VerticalRotationLimits = js.native
    def eye_rotate(camobj: Object3D, phi: Double, theta: Double, phi_is_absopt: UndefOr[Boolean], theta_is_absopt: UndefOr[Boolean]): Unit = js.native
    def eye_set_horizontal_limits(camobj: Object3D, limitsopt: UndefOr[HorizontalRotationLimits]): Unit = js.native
    def eye_set_look_at(camobj: Object3D, posopt: UndefOr[Vec3], look_atopt: UndefOr[Vec3]): Unit = js.native
    def eye_set_vertical_limits(camobj: Object3D, limitsopt: UndefOr[VerticalRotationLimits]): Unit = js.native

    def eye_setup(camobj: Object3D, paramsopt: UndefOr[EyeCameraParams]): Unit = js.native

    @deprecated("use camera.hover_get_distance_limits or camera.target_get_distance_limits instead.")
    def get_cam_dist_limits(camobj: Object3D, distopt: UndefOr[Vec2]): Vec2 = js.native


    def get_camera_angles(camobj: Object3D, destopt: UndefOr[Vec2]): Vec2 = js.native
    def get_camera_angles_char(camobj: Object3D, destopt: UndefOr[Vec2]): Vec2 = js.native

    @deprecated("use camera.get_translation instead.")
    def get_eye(camobj: Object3D, destopt: UndefOr[Vec3]): Vec3 = js.native
    def get_eye_distance(camobj: Object3D): Double = js.native
    def get_fov(camobj: Object3D): Double = js.native
    def get_frustum_planes(camobj: Object3D, planes: FrustumPlanes): FrustumPlanes = js.native

    @deprecated("use camera.eye_get_horizontal_limits, camera.target_get_horizontal_limits or camera.hover_get_horiz_trans_limits instead.")
    def get_horizontal_limits(camobj: Object3D, destopt: UndefOr[Vec2]): Vec2 = js.native

    @deprecated("use camera.hover_get_vertical_limits instead.")
    def get_hover_angle_limits(camobj: Object3D, anglesopt: UndefOr[Vec2]): Vec2 = js.native

    @deprecated("use camera.hover_get_pivot instead.")
    def get_hover_cam_pivot(camobj: Object3D, destopt: UndefOr[Vec3]): Vec3 = js.native
    def get_move_style(camobj: Object3D): CameraMoveStyle = js.native
    def get_ortho_scale(camobj: Object3D): Double = js.native
    def get_pivot(camobj: Object3D, destopt: UndefOr[Vec3]): Vec3 = js.native
    def get_stereo_distance(camobj: Object3D): Double = js.native
    def get_translation(camobj: Object3D, destopt: UndefOr[Vec3]): Vec3 = js.native
    def get_velocities(camobj: Object3D, dest: VelocityParams): VelocityParams = js.native

    @deprecated("use camera.get_velocities instead.")
    def get_velocity_params(camobj: Object3D, destopt: UndefOr[Vec3]): Vec3 = js.native

    def get_vertical_axis(camobj: Object3D, destopt: UndefOr[Vec3]): Vec3 = js.native

    @deprecated("use camera.eye_get_vertical_limits, camera.target_get_vertical_limits or camera.hover_get_vert_trans_limits instead.")
    def get_vertical_limits(camobj: Object3D, destopt: UndefOr[Vec2]): Vec2 = js.native
    def get_view_vector(camobj: Object3D, destopt: UndefOr[Vec3]): Vec3 = js.native
    def has_distance_limits(camobj: Object3D): Boolean = js.native

    @deprecated("use camera.has_horizontal_rot_limits instead.")
    def has_horizontal_limits(camobj: Object3D): Boolean = js.native
    def has_horizontal_rot_limits(camobj: Object3D): Boolean = js.native
    def has_horizontal_trans_limits(camobj: Object3D): Boolean = js.native

    @deprecated("use camera.has_vertical_rot_limits instead.")
    def has_vertical_limits(camobj: Object3D): Boolean = js.native
    def has_vertical_rot_limits(camobj: Object3D): Boolean = js.native
    def has_vertical_trans_limits(camobj: Object3D): Boolean = js.native

    @deprecated("use camera.set_translation instead.")
    def hover_cam_set_translation(camobj: Object3D, trans: Vec3): Unit = js.native
    def hover_get_distance(camobj: Object3D): Double = js.native
    def hover_get_distance_limits(camobj: Object3D, destopt: UndefOr[DistanceLimits]): DistanceLimits = js.native
    def hover_get_horiz_trans_limits(camobj: Object3D, destopt: UndefOr[HorizontalTranslationLimits]): HorizontalTranslationLimits = js.native
    def hover_get_pivot(camobj: Object3D, destopt: UndefOr[Vec3]): Vec3 = js.native
    def hover_get_vert_trans_limits(camobj: Object3D, destopt: UndefOr[VerticalTranslationLimits]): VerticalTranslationLimits = js.native
    def hover_get_vertical_limits(camobj: Object3D, destopt: UndefOr[HoverAngleLimits]): HoverAngleLimits = js.native
    def hover_rotate(camobj: Object3D, phi: Double, theta: Double, phi_is_absopt: UndefOr[Boolean], theta_is_absopt: UndefOr[Boolean]): Unit = js.native
    def hover_set_distance_limits(camobj: Object3D, limits: DistanceLimits): Unit = js.native
    def hover_set_horiz_trans_limits(camobj: Object3D, limitsnullable: HorizontalTranslationLimits): Unit = js.native
    def hover_set_pivot_translation(camobj: Object3D, trans: Vec3): Unit = js.native

    // Note - if you pass in null for limits, it disables them
    def hover_set_vert_trans_limits(camobj: Object3D, limits: VerticalTranslationLimits): Unit = js.native
    def hover_set_vertical_limits(camobj: Object3D, limits: HoverAngleLimits): Unit = js.native
    def hover_setup(camobj: Object3D, params: HoverCameraParams): Unit = js.native
    def hover_setup_rel(camobj: Object3D, params: HoverCameraParamsRel): Unit = js.native
    def hover_switch_horiz_rotation(camobj: Object3D, enable: Boolean): Unit = js.native

    def is_eye_camera(obj: Object3D): Boolean = js.native
    def is_hover_camera(obj: Object3D): Boolean = js.native
    def is_look_up(camobj: Object3D): Boolean = js.native
    def is_ortho_camera(camobj: Object3D): Boolean = js.native
    def is_static_camera(obj: Object3D): Boolean = js.native
    def is_target_camera(obj: Object3D): Boolean = js.native
    def move_pivot(camobj: Object3D, trans_h_delta: Double, trans_v_delta: Double): Unit = js.native

    // WARNING - The following declared with Float32Array because it can be a Vec2 or a Vec3
    def project_point(camobj: Object3D, point: Vec3, destopt: UndefOr[Float32Array]): Float32Array = js.native
    def rotate_camera(camobj: Object3D, phi: Double, theta: Double, phi_is_absopt: UndefOr[Boolean], theta_is_absopt: UndefOr[Boolean]): Unit = js.native

    @deprecated("use camera.eye_rotate or camera.rotate_camera instead.")
    def rotate_eye_camera(camobj: Object3D, phi: Double, theta: Double, phi_is_absopt: UndefOr[Boolean], theta_is_absopt: UndefOr[Boolean]): Unit = js.native

    @deprecated("use camera.hover_rotate instead.")
    def rotate_hover_camera(camobj: Object3D, phi: Double, theta: Double, phi_is_absopt: UndefOr[Boolean], theta_is_absopt: UndefOr[Boolean]): Unit = js.native

    @deprecated("use camera.target_rotate or camera.rotate_camera instead.")
    def rotate_target_camera(camobj: Object3D, phi: Double, theta: Double, phi_is_absopt: UndefOr[Boolean], theta_is_absopt: UndefOr[Boolean]): Unit = js.native
    def set_eye_distance(camobj: Object3D, eye_dist: Double): Unit = js.native
    def set_fov(camobj: Object3D, fov: Double): Unit = js.native
    def set_hmd_fov(camobj: Object3D, hmd_left_fov: Vec4, hmd_right_fov: Vec4): Unit = js.native

    @deprecated("use camera.hover_set_pivot_translation instead.")
    def set_hover_pivot(camobj: Object3D, coords: Vec3): Unit = js.native

    @deprecated("use camera.static_set_look_at or camera.eye_set_look_at instead.")
    def set_look_at(camobj: Object3D, eye: Vec3, target: Vec3, upopt: UndefOr[Vec3]): Unit = js.native

    @deprecated("use camera.static_setup or camera.eye_setup or camera.target_setup or camera.hover_setup or camera.hover_setup_rel instead.")
    def set_move_style(camobj: Object3D, move_style: CameraMoveStyle): Boolean = js.native
    def set_ortho_scale(camobj: Object3D, ortho_scale: Double): Unit = js.native

    @deprecated("use camera.target_set_trans_pivot instead.")
    def set_pivot(camobj: Object3D, coords: Vec3): Unit = js.native

    def set_stereo_distance(camobj: Object3D, conv_dist: Double): Unit = js.native

    @deprecated("use camera.target_set_trans_pivot instead.")
    def set_trans_pivot(camobj: Object3D, trans: Vec3, pivot: Vec3): Unit = js.native
    def set_translation(camobj: Object3D, trans: Vec3): Unit = js.native
    def set_velocities(camobj: Object3D, velocity: VelocityParams): Unit = js.native

    @deprecated("use camera.set_velocities instead.")
    def set_velocity_params(camobj: Object3D, velocity: Vec3): Unit = js.native
    def set_vertical_axis(camobj: Object3D, axis: Vec3): Unit = js.native
    def static_get_rotation(camobj: Object3D, destopt: UndefOr[Quat]): Quat = js.native
    def static_set_look_at(camobj: Object3D, posopt: UndefOr[Vec3], look_atopt: UndefOr[Vec3]): Unit = js.native
    def static_set_rotation(camobj: Object3D, quat: Quat): Unit = js.native
    def static_setup(camobj: Object3D, paramsopt: UndefOr[StaticCameraParams]): Unit = js.native
    def target_get_distance(camobj: Object3D): Double = js.native
    def target_get_distance_limits(camobj: Object3D, destopt: UndefOr[DistanceLimits]): DistanceLimits = js.native
    def target_get_horizontal_limits(camobj: Object3D, destopt: UndefOr[HorizontalRotationLimits], localopt: UndefOr[Boolean]): HorizontalRotationLimits = js.native

    def target_get_pivot(camobj: Object3D, destopt: UndefOr[Vec3]): Vec3 = js.native
    def target_get_pivot_limits(camobj: Object3D, destopt: UndefOr[PivotLimits]): PivotLimits = js.native
    def target_get_vertical_limits(camobj: Object3D, destopt: UndefOr[VerticalRotationLimits], localopt: UndefOr[Boolean]): VerticalRotationLimits = js.native

    def target_pan_pivot(camobj: Object3D, trans_h_delta: Double, trans_v_delta: Double): Unit = js.native
    def target_rotate(camobj: Object3D, phi: Double, theta: Double, phi_is_absopt: UndefOr[Boolean], theta_is_absopt: UndefOr[Boolean]): Unit = js.native
    def target_set_distance(camobj: Object3D, distance: Double): Unit = js.native
    def target_set_distance_limits(camobj: Object3D, limitsopt: UndefOr[DistanceLimits]): Unit = js.native
    def target_set_horizontal_limits(camobj: Object3D, limitsopt: UndefOr[HorizontalRotationLimits]): Unit = js.native

    def target_set_pivot_limits(camobj: Object3D, limitsopt: UndefOr[PivotLimits]): Unit = js.native
    def target_set_pivot_translation(camobj: Object3D, trans: Vec3): Unit = js.native
    def target_set_trans_pivot(camobj: Object3D, transopt: UndefOr[Vec3], pivotopt: UndefOr[Vec3]): Unit = js.native
    def target_set_vertical_limits(camobj: Object3D, limitsopt: UndefOr[VerticalRotationLimits]): Unit = js.native
    def target_setup(camobj: Object3D, params: TargetCameraParams): Unit = js.native
    def target_switch_panning(camobj: Object3D, enable: Boolean): Unit = js.native
    def target_zoom_object(camobj: Object3D, obj: Object3D): Unit = js.native
    def translate_view(camobj: Object3D, x: Double, y: Double, angle: Double): Unit = js.native
    def zoom_object(camobj: Object3D, obj: Object3D): Unit = js.native


  }

  @ScalaJSDefined
  class DistanceLimits extends js.Object {
    var min: Double = _
    var max: Double = _
  }

  @ScalaJSDefined
  class EyeCameraParams extends js.Object {
    var pos: UndefOr[Vec3] = js.undefined
    var look_at: UndefOr[Vec3] = js.undefined
    var horiz_rot_lim: UndefOr[HorizontalRotationLimits] = js.undefined
    var vert_rot_lim: UndefOr[VerticalRotationLimits] = js.undefined
  }

  @ScalaJSDefined
  class FrustumPlanes extends js.Object {
    var Left:	Plane = _
    var Right:	Plane = _
    var Top:	Plane = _
    var Bottom:	Plane = _
    var Near:	Plane = _
    var Far:	Plane = _
  }

  @ScalaJSDefined
  class HorizontalRotationLimits extends js.Object {
    var left: Double = _
    var right: Double = _
    var camera_space: UndefOr[Boolean] = js.undefined
  }

  @ScalaJSDefined
  class HorizontalTranslationLimits extends js.Object {
    var min: Double = _
    var max: Double = _
  }

  @ScalaJSDefined
  class HoverAngleLimits extends js.Object {
    var down: Double = _
    var up: Double = _
  }

  @ScalaJSDefined
  class HoverCameraParams extends js.Object {
    var pos: UndefOr[Vec3] = js.undefined
    var pivot:	Vec3 = _
    var dist_lim: UndefOr[DistanceLimits] = js.undefined
    var hover_angle_lim: UndefOr[HoverAngleLimits] = js.undefined
    var horiz_trans_lim: UndefOr[HorizontalTranslationLimits] = js.undefined
    var vert_trans_lim: UndefOr[VerticalTranslationLimits] = js.undefined
    var enable_horiz_rot: UndefOr[Boolean] = js.undefined
  }

  @ScalaJSDefined
  class HoverCameraParamsRel extends js.Object {
    var pos: UndefOr[Vec3] = js.undefined
    var pivot:	Vec3 = _
    var dist_interval: UndefOr[Double] = js.undefined
    var angle_interval: UndefOr[Double] = js.undefined
    var t: UndefOr[Double] = js.undefined
  }

  @ScalaJSDefined
  class PivotLimits extends js.Object {
    var min_y: Double = _
    var max_y: Double = _
  }

  @ScalaJSDefined
  class StaticCameraParams extends js.Object {
    var pos: UndefOr[Vec3] = js.undefined
    var look_at: UndefOr[Vec3] = js.undefined
  }

  @ScalaJSDefined
  class TargetCameraParams extends js.Object {
    var pos: UndefOr[Vec3] = js.undefined
    var pivot:	Vec3 = _
    var horiz_rot_lim: UndefOr[HorizontalRotationLimits] = js.undefined
    var vert_rot_lim: UndefOr[VerticalRotationLimits] = js.undefined
    var dist_lim: UndefOr[DistanceLimits] = js.undefined
    var pivot_lim: UndefOr[PivotLimits] = js.undefined
    var use_panning: UndefOr[Boolean] = js.undefined
  }

  @ScalaJSDefined
  class VelocityParams extends js.Object {
    var trans: UndefOr[Double] = js.undefined
    var rot: UndefOr[Double] = js.undefined
    var zoom: UndefOr[Double] = js.undefined
  }

  @ScalaJSDefined
  class VerticalRotationLimits extends js.Object {
    var down: Double = _
    var up: Double = _
    var camera_space: UndefOr[Boolean] = js.undefined
  }

  @ScalaJSDefined
  class VerticalTranslationLimits extends js.Object {
    var min: Double = _
    var max: Double = _
  }

  type ParametricLine = Float32Array
  type Quat = Float32Array
  @deprecated("Not needed anymore.")
  type Space = Int

  // TODO - Define these ASAP!
  type Plane = Nothing

  @JSName("camera_anim")
  @js.native
  class camera_anim extends js.Object {

    def auto_rotate(auto_rotate_ratio: Double, callbackopt: AutoRotateDisabledCallback, disable_on_mouse_wheelopt: Boolean): Unit = js.native
    def check_auto_rotate(): Boolean = js.native
    def is_auto_rotate(): Boolean = js.native
    def is_moving(): Boolean = js.native
    def is_rotating(): Boolean = js.native

    // TODO - This gets a little goofy. point_obj can be a Object3D or a TSR
    def move_camera_to_point(cam_obj: Object3D, point_obj: Object3D, cam_lin_speed: Double, cam_angle_speed: Double, cbopt: UndefOr[MoveCameraToPointCallback]): Unit = js.native
    def rotate_camera(cam_obj: Object3D, angle_phi: Double, angle_theta: Double, timeopt: UndefOr[Double], cbopt: UndefOr[RotateCameraCallback]): Unit = js.native
    def stop_cam_moving(): Unit = js.native
    def stop_cam_rotating(): Unit = js.native

    // TODO - This gets a little goofy. target can be a Object3D or a TSR
    def track_to_target(cam_obj: Object3D, target: Object3D, rot_speed: Double, zoom_mult: Double, zoom_time: Double, zoom_delay: Double,
                        callbackopt: UndefOr[TrackToTargetCallback], zoom_cbopt: UndefOr[TrackToTargetZoomCallback]): Unit = js.native

  }

  type AutoRotateDisabledCallback = Function0[Any]
  type MoveCameraToPointCallback = Function0[Any]
  type RotateCameraCallback = Function0[Any]
  type TrackToTargetCallback = Function0[Any]
  type TrackToTargetZoomCallback = Function0[Any]

  @JSName("config")
  @js.native
  // There are a whole host of parameters that can be manipulated. For more info, see the official API
  // Though the API recommends against using this class, I could see its usefulness in doing a basic sanity check.
  class config extends js.Object {
    val P_CUSTOM: QualityProfile = js.native
    val P_HIGH: QualityProfile = js.native
    val P_LOW: QualityProfile = js.native
    val P_ULTRA: QualityProfile = js.native

    def get(prop: String): js.Object = js.native
    def get_std_assets_path(): String = js.native
    def reset(): Unit = js.native
    def set(prop: String, value: js.Object): Unit = js.native



  }

  type QualityProfile = Double

}
