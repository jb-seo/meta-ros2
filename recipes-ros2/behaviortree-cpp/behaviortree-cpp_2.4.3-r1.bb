# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides a behavior trees core."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = "ament-cmake libzmq3-dev"
SRC_URI = "https://github.com/BehaviorTree/behaviortree_cpp-release/archive/release/crystal/behaviortree_cpp/2.4.3-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8a33a0a2672e30229ed979898941deb2"
SRC_URI[sha256sum] = "119e8a57c251ae3979a0481b693f062941796764ee047eb40eff98789183a9aa"
S = "${WORKDIR}/behaviortree_cpp-release-release-crystal-behaviortree_cpp-2.4.3-1"

inherit catkin
