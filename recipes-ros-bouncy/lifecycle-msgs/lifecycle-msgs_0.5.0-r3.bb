# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A package containing some lifecycle related message and service definitions."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake rosidl-default-generators rosidl-default-runtime"
SRC_URI = "https://github.com/ros2-gbp/rcl_interfaces-release/archive/release/bouncy/lifecycle_msgs/0.5.0-3.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d93f12a48ef73def39b9f2a5ae95a26b"
SRC_URI[sha256sum] = "9e4c5155430eed2c4285e730cac513e0f3c512c3b0abdb312024b507fe7ee565"
S = "${WORKDIR}/rcl_interfaces-release-release-bouncy-lifecycle_msgs-0.5.0-3"

inherit catkin
