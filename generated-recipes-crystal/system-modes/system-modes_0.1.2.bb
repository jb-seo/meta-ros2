# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Model-based distributed configuration handling."
AUTHOR = "Arne Nordmann <arne.nordmann@bosch.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_BUILD_DEPENDS = " \
    boost \
    builtin-interfaces \
    rclcpp \
    rclcpp-lifecycle \
    rosidl-default-generators \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-ros-native \
"

ROS_EXPORT_DEPENDS = " \
    boost \
    builtin-interfaces \
    rclcpp \
    rclcpp-lifecycle \
    rosidl-default-generators \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = ""

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake \
    ament-cmake-cppcheck \
    ament-cmake-cpplint \
    ament-cmake-flake8 \
    ament-cmake-gmock \
    ament-cmake-gtest \
    ament-cmake-pep257 \
    ament-cmake-uncrustify \
    ament-lint-auto \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/microROS/system_modes-release/archive/release/crystal/system_modes/0.1.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "3a47c0b87ef296450334fa10f9d8fb5f"
SRC_URI[sha256sum] = "0ab125b66ddef7e164e8f9014f60a32b55e99fb0e2caf0be1b43b4a847a3a4fb"
S = "${WORKDIR}/system_modes-release-release-crystal-system_modes-0.1.2-0"

ROS_BUILD_TYPE = "ament_cmake"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/system-modes/system-modes_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/system-modes/system-modes_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/system-modes/system-modes-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/system-modes/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/system-modes/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
