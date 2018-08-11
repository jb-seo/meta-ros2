# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A package containing some message definitions used in the implementation or actions."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake builtin-interfaces rosidl-default-generators rosidl-default-runtime std-msgs"
SRC_URI = "https://github.com/ros2-gbp/common_interfaces-release/archive/release/bouncy/actionlib_msgs/0.5.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d5a3fd4807fd762e599061c57b2f874e"
SRC_URI[sha256sum] = "c373c631b037c8f2321ea5f2581e0897b22c1e64c3dd89d2171d4231c5485efa"
S = "${WORKDIR}/common_interfaces-release-release-bouncy-actionlib_msgs-0.5.0-1"

inherit catkin
