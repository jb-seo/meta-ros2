# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Basic message types for two dimensional navigation, extending from geometry_msgs::Pose2D."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ament-cmake geometry-msgs rosidl-default-generators rosidl-default-runtime std-msgs"
SRC_URI = "https://github.com/SteveMacenski/navigation2-release/archive/release/crystal/nav_2d_msgs/0.1.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c5014745d8401fe7fc68730cf5d88e10"
SRC_URI[sha256sum] = "94c8a253c1f62e024bb50d3419ef2474fa8b3029aaf3fb290f7747a0ea0e87b8"
S = "${WORKDIR}/navigation2-release-release-crystal-nav_2d_msgs-0.1.5-0"

inherit catkin
