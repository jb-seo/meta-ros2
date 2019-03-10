# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A package containing some geometry related message definitions."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake rosidl-default-generators rosidl-default-runtime std-msgs"
SRC_URI = "https://github.com/ros2-gbp/common_interfaces-release/archive/release/crystal/geometry_msgs/0.6.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "67a8ff20dfb819ba254e98bb5f6b5651"
SRC_URI[sha256sum] = "b7f94748df58d15b6b2235a8be0e7ea51f2b72adb73c4f4ae137a38899a3a40f"
S = "${WORKDIR}/common_interfaces-release-release-crystal-geometry_msgs-0.6.1-0"

inherit catkin
