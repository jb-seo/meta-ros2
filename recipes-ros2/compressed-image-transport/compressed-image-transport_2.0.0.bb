# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Compressed_image_transport provides a plugin to image_transport for transparently sending images     encoded as JPEG or PNG."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ament-cmake cv-bridge image-transport"
SRC_URI = "https://github.com/ros2-gbp/image_transport_plugins-release/archive/release/crystal/compressed_image_transport/2.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "bdbf58e08377a51a87c9643acb2820d0"
SRC_URI[sha256sum] = "aa631582dbcb9af820c40dd48c116d705b020b0f9fe5d49e660ba3bb078d87de"
S = "${WORKDIR}/image_transport_plugins-release-release-crystal-compressed_image_transport-2.0.0-0"

inherit catkin
