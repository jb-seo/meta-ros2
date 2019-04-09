# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This contains CvBridge, which converts between ROS2     Image messages and OpenCV images."
AUTHOR = "Ethan Gao <ethan.gao@linux.intel.com>"
HOMEPAGE = "http://www.ros.org/wiki/cv_bridge"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = " \
    boost \
    opencv \
    python3-numpy \
    sensor-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-ros-native \
    python-cmake-module-native \
"

ROS_EXPORT_DEPENDS = " \
    boost \
    opencv \
    python3-numpy \
    sensor-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ament-index-python \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gtest \
    ament-cmake-pytest \
    ament-lint-auto \
    ament-lint-common \
    python3-opencv \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/vision_opencv-release/archive/release/crystal/cv_bridge/2.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "0b4e7531aece620dcfec7e81228d21ea"
SRC_URI[sha256sum] = "13c70c9ab1a1a243b1e8c6cd77384e9f037ef7e5b0daf94e1d70ffc6dda2ce53"
S = "${WORKDIR}/vision_opencv-release-release-crystal-cv_bridge-2.1.0-0"

ROS_BUILD_TYPE = "ament_cmake"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/vision-opencv/vision-opencv_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/vision-opencv/vision-opencv_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/vision-opencv/vision-opencv-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/vision-opencv/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/vision-opencv/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
