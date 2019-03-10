# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "AprilTag message definitions"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = "ament-cmake rosidl-default-generators rosidl-default-runtime std-msgs"
SRC_URI = "https://github.com/christianrauch/apriltag2_node-release/archive/release/crystal/apriltag_msgs/1.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "74bfc586e7770f6a7c107fb940a8b190"
SRC_URI[sha256sum] = "af7792e34c22e34c7cf69608d103c3d27cb182bb5741a3848fb21d4eb59cc028"
S = "${WORKDIR}/apriltag2_node-release-release-crystal-apriltag_msgs-1.0.1-0"

inherit catkin
