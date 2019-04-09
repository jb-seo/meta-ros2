# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides a C++ interface for camera calibration      information.  It provides CameraInfo, and handles SetCameraInfo      service requests, saving and restoring the camera calibration      data."
AUTHOR = "Michael Carroll <michael@openrobotics.org>"
HOMEPAGE = "http://ros.org/wiki/camera_info_manager"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = " \
    camera-calibration-parsers \
    image-transport \
    rclcpp \
    sensor-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-ros-native \
"

ROS_EXPORT_DEPENDS = " \
    camera-calibration-parsers \
    image-transport \
    rclcpp \
    sensor-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = ""

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gtest \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/image_common-release/archive/release/crystal/camera_info_manager/2.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "0db22c0d74a092d83576ca229b0a8a92"
SRC_URI[sha256sum] = "65a8f9750504734de8a7033629376d64487c7a0467394f8438b92ff98aee89ef"
S = "${WORKDIR}/image_common-release-release-crystal-camera_info_manager-2.0.1-0"

ROS_BUILD_TYPE = "ament_cmake"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/image-common/image-common_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/image-common/image-common_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/image-common/image-common-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/image-common/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/image-common/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
