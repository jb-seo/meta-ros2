# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Implementation of RTPS standard."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "asio cmake fastcdr libssl-dev libtinyxml2"
SRC_URI = "https://github.com/ros2-gbp/${PN}-release/archive/release/crystal/${PN}/1.7.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "de694ae70a57300271b31e641b4ac81f"
SRC_URI[sha256sum] = "390be01bb7b5d56c76765d518ce6a8dc31d8ed46e6f921186cebd01c7a2759d7"
S = "${WORKDIR}/${PN}-release-release-crystal-${PN}-1.7.0-0"

inherit catkin
