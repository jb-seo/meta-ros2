# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Custom messages for real-time pendulum control."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = " builtin-interfaces rosidl-default-generators rosidl-default-runtime"
SRC_URI = "https://github.com/ros2-gbp/demos-release/archive/release/crystal/pendulum_msgs/0.6.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c816e3f4f646f7b61a10f187be490ee8"
SRC_URI[sha256sum] = "fdd12dbae8648dc5a8ca7d6ca10ce2e7a273de06391103bf4edd02adb71484c2"
S = "${WORKDIR}/demos-release-release-crystal-pendulum_msgs-0.6.2-0"

inherit ament pythonpath-insane
