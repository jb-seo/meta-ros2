# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Wrapper around console_bridge, providing nothing but a dependency on console_bridge, on some systems.     On others, it provides an ExternalProject build of console_bridge."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0 & BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=f12ef8c0445c08084ae92cf2dcb7ee92"

DEPENDS = " console-bridge"
SRC_URI = "https://github.com/ros2-gbp/console_bridge_vendor-release/archive/release/crystal/console_bridge_vendor/1.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e8a07b8b2393405abf51ed7e4be41090"
SRC_URI[sha256sum] = "1a8eb7126fa9825f35ad4f5373646c2df8b68595d0d6e4c2a595c3916e8f7722"
S = "${WORKDIR}/console_bridge_vendor-release-release-crystal-console_bridge_vendor-1.1.0-0"

inherit ament
