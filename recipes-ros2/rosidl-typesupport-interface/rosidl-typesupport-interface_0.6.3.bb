# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The interface for rosidl typesupport packages."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake"
SRC_URI = "https://github.com/ros2-gbp/rosidl-release/archive/release/crystal/rosidl_typesupport_interface/0.6.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "14f334c3785fa2bb555be358ffbb9088"
SRC_URI[sha256sum] = "c26bc487256f5667128fe176e27cf2295aab3474a41a53286066e0405b36d085"
S = "${WORKDIR}/rosidl-release-release-crystal-rosidl_typesupport_interface-0.6.3-0"

inherit catkin
